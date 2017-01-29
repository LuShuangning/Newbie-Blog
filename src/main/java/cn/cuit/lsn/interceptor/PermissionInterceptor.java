package cn.cuit.lsn.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.cuit.lsn.controller.front.StoreController;

public class PermissionInterceptor implements HandlerInterceptor{

	private static final Logger logger = Logger.getLogger(PermissionInterceptor.class);
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	//返回值表示是否将当前的请求拦截下来
	//如果返回false，请求将被终止
	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		HttpSession session = arg0.getSession();
		
		//对用户的登录信息进行验证
		String userName = (String)session.getAttribute("userName");
		String url = arg0.getRequestURL().toString();
		
		if (userName == null) {
			//如果用户没有登录，终止请求并发送到登录页面。
			logger.info("==================当前尚未登录，即将跳转到登录界面");
			session.setAttribute("url",url);
			arg0.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(arg0, arg1);
			return false;
		}else{
			logger.info("=================当前用户是" + userName);
			return true;
		}
		
	}
	
}
