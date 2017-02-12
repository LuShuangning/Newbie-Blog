/**
 * 
 */
package cn.cuit.lsn.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.cuit.lsn.service.EssaysService;
import cn.cuit.lsn.service.NotesService;
import cn.cuit.lsn.service.QuerryStoreService;

/**
 * @author 路双宁
 *
 */

@Controller
@RequestMapping("/notes")
public class NotesController {
	@Autowired
	private NotesService notesService;
	
	@RequestMapping("/show")
	public ModelAndView show(ModelAndView model){

//		String json = notesService.querryAlbum();
//		
//		if (json == null || json.length() < 1) {
//			model.setViewName("redirect:/error/404");
//			return model;
//		}
//		model.addObject("album",json);
		model.setViewName("notes/show-notes");
		return model;
	}
	
	@RequestMapping(value = "/detail/{belongTo}",produces = "application/json; charset=utf-8")
	public ModelAndView detail(@PathVariable String belongTo,ModelAndView model){
		String json = notesService.querryDetail(belongTo);
		
		if (json == null || json.length() < 1) {
			model.setViewName("redirect:error/404");
			return model;
		}
		model.addObject("album",json);
		model.setViewName("notes/detail");
		
		return model;
		
	}
}
