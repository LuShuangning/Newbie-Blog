package cn.cuit.lsn.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cuit.lsn.service.impl.GetFileLocServiceImpl;


@Controller
public class MeController {
	@Autowired
	private GetFileLocServiceImpl getfileLoc;
	
	@RequestMapping("/me")
	public String test(Model model){
		getFileLoc();
		return "me";
	}
	
	public String getFileLoc(){
		
		System.out.println("要查找的文件路径为：" + getfileLoc.readFile().getFileLoc());
		return null;
	}
}
