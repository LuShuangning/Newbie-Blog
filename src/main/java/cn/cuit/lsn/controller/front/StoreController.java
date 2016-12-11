package cn.cuit.lsn.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@RequestMapping("/index")
	public String requestIndex(){
		
		return "/store/store";
	}
}
