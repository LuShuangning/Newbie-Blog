package cn.cuit.lsn.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cuit.lsn.service.impl.GetTxtFileContentServiceImpl;


@Controller
@RequestMapping("/me")
public class MeController {
	@Autowired
	private GetTxtFileContentServiceImpl getTFC;
	
	@RequestMapping("/home")
	public String home(){

		//视图呈现页面
		return "/about-me/me";
	}
	
	@RequestMapping(value = "/article",produces = "application/json; charset=utf-8")
	public @ResponseBody String article(){
		String json = getTFC.contentPackaged("me");
		
		return json;
	}
	
	
	
}
