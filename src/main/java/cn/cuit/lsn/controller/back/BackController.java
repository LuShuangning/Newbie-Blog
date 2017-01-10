package cn.cuit.lsn.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/back")
public class BackController {
	
	@RequestMapping("/contro")
	public String backEnd(){
		
		return "/back/back-end";
	}
}
