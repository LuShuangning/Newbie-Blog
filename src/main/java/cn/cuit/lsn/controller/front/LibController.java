package cn.cuit.lsn.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/library")
public class LibController {
	
	@RequestMapping("/index")
	public String test(Model model){
		
		
		return "library";
	}
	
}
