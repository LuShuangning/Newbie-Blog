package cn.cuit.lsn.controller.front;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.cuit.lsn.service.EssaysService;


@Controller
@RequestMapping("/essays")
public class EssaysController {
	@Autowired
	private EssaysService essaysService;
	
	@RequestMapping("/introduction")
	public String introduction(){

		//视图呈现页面
		return "/intro/self";
	}
	
	@RequestMapping(value = "/brief/{essayType}",produces = "application/json; charset=utf-8")
	public @ResponseBody String brief(@PathVariable String essayType){
		String json = essaysService.querryAll(essayType,0);
		
		return json;
	}
	
	@RequestMapping(value = "/self/{title}",produces = "application/json; charset=utf-8")
	public @ResponseBody String self(@PathVariable String title){
//		String json = getTFCService.contentPackaged("心形线的故事");
		String json = essaysService.querryByTitle(title);
		return json;
	}
	
	@RequestMapping(value = "/article/{essayId}",produces = "application/json; charset=utf-8")
	public ModelAndView article(@PathVariable String essayId,ModelAndView modelAndView){

		Map<String, String> map = essaysService.querryByUUID(essayId);
		if (map == null || map.size() < 1) {
			modelAndView.setViewName("/error/404");
			return modelAndView;
		}
		modelAndView.setViewName("/real-stuff/detail");
		modelAndView.addObject("map",map);
		
		return modelAndView;
	}
	
}
