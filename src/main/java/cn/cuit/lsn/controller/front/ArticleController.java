package cn.cuit.lsn.controller.front;

import java.util.List;
import java.util.Map;

import cn.cuit.lsn.dto.ArticleBriefDto;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.cuit.lsn.service.ArticleService;


@Controller
@RequestMapping("/articles")
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/introduction")
	public String introduction(){

		//视图呈现页面
		return "intro/self";
	}

	@RequestMapping("/brief")
	public String brief(){

		return "real-stuff/show-article";
	}
	
	@RequestMapping("/sponsor")
	public String sponsor(){

		//视图呈现页面
		return "sponsor";
	}
	
	@RequestMapping(value = "/brief/{articleType}/{pageNum}/{pageSize}",produces = "application/json; charset=utf-8")
	public @ResponseBody String brief(
			@PathVariable String articleType,
			@PathVariable Integer pageNum,
			@PathVariable Integer pageSize){

		System.out.println("PageNum is " + pageNum + "and PageSize is " + pageSize);
		List<ArticleBriefDto> list = articleService.queryAll(articleType,pageNum,pageSize);
		PageInfo<ArticleBriefDto> page = new PageInfo<>(list);

		String json = JSON.toJSONString(page);

		System.out.println(json);

		return json;
	}
	
	@RequestMapping(value = "/self/{title}",produces = "application/json; charset=utf-8")
	public @ResponseBody String self(@PathVariable String title){
		String json = articleService.queryByTitle(title);
//		System.out.println(json);
		return json;
	}
	
	@RequestMapping(value = "/detail/{articleId}",produces = "application/json; charset=utf-8")
	public ModelAndView article(@PathVariable String articleId,ModelAndView modelAndView){

		Map<String, String> map = articleService.queryByUUID(articleId);
		if (map == null || map.size() < 1) {
			modelAndView.setViewName("redirect:error/404");
			return modelAndView;
		}
		modelAndView.setViewName("real-stuff/detail");
		modelAndView.addObject("map",map);
		
		return modelAndView;
	}
	
}
