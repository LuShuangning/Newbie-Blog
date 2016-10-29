package cn.cuit.lsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MeController {
	@RequestMapping("/me")
	public String test(Model model){
		return "me";
	}
}
