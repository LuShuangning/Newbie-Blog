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
		return "intro/self";
	}
	
	@RequestMapping("/sponsor")
	public String sponsor(){

		//视图呈现页面
		return "sponsor";
	}
	
	@RequestMapping(value = "/brief/{essayType}",produces = "application/json; charset=utf-8")
	public ModelAndView brief(
			@PathVariable String essayType,ModelAndView modelAndView){
		String json = essaysService.querryAll(essayType,0);
		
		if (json == null || json.length() < 1) {
			modelAndView.setViewName("redirect:error/404");
			return modelAndView;
		}
		modelAndView.setViewName("real-stuff/show-article");
		modelAndView.addObject("listMap",json);
		return modelAndView;
	}
	
	@RequestMapping(value = "/self/{title}",produces = "application/json; charset=utf-8")
	public @ResponseBody String self(@PathVariable String title){
//		String json = getTFCService.contentPackaged("心形线的故事");
		String json = essaysService.querryByTitle(title);
		return json;
	}
	
	@RequestMapping(value = "/detail/{essayId}",produces = "application/json; charset=utf-8")
	public ModelAndView article(@PathVariable String essayId,ModelAndView modelAndView){

		Map<String, String> map = essaysService.querryByUUID(essayId);
		if (map == null || map.size() < 1) {
			modelAndView.setViewName("redirect:error/404");
			return modelAndView;
		}
		modelAndView.setViewName("real-stuff/detail");
		modelAndView.addObject("map",map);
		
		return modelAndView;
	}
	
}
