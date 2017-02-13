/**
 * 
 */
package cn.cuit.lsn.controller.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 路双宁
 *
 */

@Controller
public class PermissionController {
	@Autowired HttpServletRequest request;
	@Autowired HttpSession session;
	
	private static final Logger logger = Logger.getLogger(PermissionController.class);
	
	
	@RequestMapping("/login")
	public String login(String userName,String password){
		session.setAttribute("userName", userName);
		session.setAttribute("password", password);
//		String url = (String)session.getAttribute("url");
//		logger.info("现在路径为:" + url);
//		if (url == null) {
//			logger.info("现在路径为空，默认跳转到主页");
//			return "redirect:";
//		}else{
//			return "redirect:" + url;
//		}
		
		return "redirect:back/contro";
	}
	
	@RequestMapping("/loginPage")
	public String loginPage(){
		
		return "login";
	}
}
