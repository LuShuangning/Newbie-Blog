package cn.cuit.lsn.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/real-stuff")
public class RealStuffController {
	
	@RequestMapping("/show")
	public String requestIndex(Model model){
		
		
		return "real-stuff/show-article";
	}
	
}
