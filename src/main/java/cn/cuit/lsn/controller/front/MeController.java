package cn.cuit.lsn.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cuit.lsn.service.EssaysService;
import cn.cuit.lsn.service.GetTxtFileContentService;
import cn.cuit.lsn.service.impl.GetTxtFileContentServiceImpl;


@Controller
@RequestMapping("/self")
public class MeController {
	@Autowired
	private GetTxtFileContentService getTFCService;
	
	@Autowired
	private EssaysService essaysService;
	
	@RequestMapping("/introduction")
	public String requestIndex(){

		//视图呈现页面
		return "/about-me/self";
	}
	
	@RequestMapping(value = "/article",produces = "application/json; charset=utf-8")
	public @ResponseBody String article(){
//		String json = getTFCService.contentPackaged("心形线的故事");
		
		String json = essaysService.querryByTitle("我的故事");
		return json;
	}
	
	
	
}
