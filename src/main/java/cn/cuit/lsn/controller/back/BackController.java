package cn.cuit.lsn.controller.back;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.pojo.Essays;
import cn.cuit.lsn.service.EssaysService;


@Controller
@RequestMapping("/back")
public class BackController {
	@Autowired EssaysService essayService;
	
	private static final Logger logger = Logger.getLogger(BackController.class);
	
	
	@RequestMapping("/contro")
	public String backEnd(){
		
		return "/back/back-end";
	}
	
	@RequestMapping(value = "save", method = {RequestMethod.POST })
	@ResponseBody
	public void  save(EssaysDto essaysDto){
		essayService.save(essaysDto);
//		Essays essays = essayService.querryByTitle("测试");
//		System.out.println(essays.getEssayTitle() + "==============================");
	}
	
}
