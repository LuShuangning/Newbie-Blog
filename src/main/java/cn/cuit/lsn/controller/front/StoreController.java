package cn.cuit.lsn.controller.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.cuit.lsn.service.impl.DownloadBooksServiceImpl;

@Controller
@RequestMapping("/store")
public class StoreController {
	@Autowired 
	private DownloadBooksServiceImpl download;
	
	@RequestMapping("/index")
	public String requestIndex(){
		
		return "/store/store";
	}
	
	@RequestMapping("/books/download")
	public String download(@RequestParam("bookName") String bookName){
		
		download.downloadBook(bookName);
		return null;
	}
}
