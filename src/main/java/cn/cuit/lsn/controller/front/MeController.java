package cn.cuit.lsn.controller.front;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cuit.lsn.service.impl.GetTxtFileContentServiceImpl;
import net.sf.json.JSONArray;


@Controller
public class MeController {
	@Autowired
	private GetTxtFileContentServiceImpl getTFC;
	@Autowired
	private HttpServletResponse response;
	
	@RequestMapping("/me")
	public String test(Model model){
		
		JSONArray json = getTFC.contentPackaged("me");
		try {
			response.getWriter().write(json.toString());
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		//视图呈现页面
		return "me";
	}
	
}
