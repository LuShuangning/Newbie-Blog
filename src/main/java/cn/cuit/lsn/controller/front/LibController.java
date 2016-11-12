package cn.cuit.lsn.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LibController {
	
	@RequestMapping("/library")
	public String test(Model model){
		
		return "library";
	}
	
}
