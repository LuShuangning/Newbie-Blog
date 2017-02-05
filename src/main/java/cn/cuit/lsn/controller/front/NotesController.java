/**
 * 
 */
package cn.cuit.lsn.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cuit.lsn.service.EssaysService;

/**
 * @author 路双宁
 *
 */

@Controller
@RequestMapping("/notes")
public class NotesController {
	@Autowired
	private EssaysService essaysService;
	
	@RequestMapping("/show")
	public String test(){

		//视图呈现页面
		return "/notes/show-notes";
	}
}
