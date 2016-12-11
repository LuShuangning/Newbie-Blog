package cn.cuit.lsn.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/realStuff")
public class RealStuffController {
	
	@RequestMapping("/index")
	public String requestIndex(Model model){
		
		
		return "/real-stuff/real-stuff";
	}
	
}
