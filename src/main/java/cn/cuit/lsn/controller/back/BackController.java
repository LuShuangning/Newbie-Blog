package cn.cuit.lsn.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackController {
	@RequestMapping("/backend")
	public String backEnd(){
		
		return "/back/back-end";
	}
}
