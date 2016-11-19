package cn.cuit.lsn.controller.front;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cuit.lsn.service.impl.GetTxtFileContentServiceImpl;


@Controller
public class MeController {
	@Autowired
	private GetTxtFileContentServiceImpl getTextContent;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/me")
	public String test(Model model){
		request.setAttribute("textContent", 
				getTextContent.getContent("me"));
		//视图呈现页面
		return "me";
	}
	
}
