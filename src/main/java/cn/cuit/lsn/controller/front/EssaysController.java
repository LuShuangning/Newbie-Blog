package cn.cuit.lsn.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cuit.lsn.service.EssaysService;
import cn.cuit.lsn.service.GetTxtFileContentService;
import cn.cuit.lsn.service.impl.GetTxtFileContentServiceImpl;


@Controller
@RequestMapping("/essays")
public class EssaysController {
	@Autowired
	private EssaysService essaysService;
	
	@RequestMapping("/introduction")
	public String requestIndex(){

		//视图呈现页面
		return "/intro/self";
	}
	
	@RequestMapping(value = "/article/{essayId}",produces = "application/json; charset=utf-8")
	public @ResponseBody String article(@PathVariable String essayId){
//		String json = getTFCService.contentPackaged("心形线的故事");
		
		String json = essaysService.querryByUUID(essayId);
		return json;
	}
	
	
	
}
