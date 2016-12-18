package cn.cuit.lsn.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.cuit.lsn.service.impl.DownloadServiceImpl;

@Controller
@RequestMapping("/store")
public class StoreController {
	@Autowired 
	private DownloadServiceImpl download;
	
	@RequestMapping("/index")
	public String requestIndex(){
		
		return "/store/store";
	}
	
	//REST风格的传参方式
	@RequestMapping("/books/download/{bookName}")
	public String download(@PathVariable String bookName){
		
		download.downloadBook(bookName);
		return null;
	}
}
