package cn.cuit.lsn.controller.front;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cuit.lsn.service.DownloadService;
import cn.cuit.lsn.service.QuerryBooksService;

@Controller
@RequestMapping("/store")
public class StoreController {
	@Autowired 
	private DownloadService downloadService;
	@Autowired 
	private QuerryBooksService querryBooksService;
	
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(StoreController.class);
	
	@RequestMapping("/index")
	public String requestIndex(){
		
		return "/store/store";
	}
	
	@RequestMapping("/books/list")
	public @ResponseBody String bookList(@RequestParam String category){
		System.out.println("查询的类型为：" + category);
		String json = querryBooksService.querry(category);
		
		return json;
	}
	
	//REST风格的传参方式
	@RequestMapping("/books/{bookName}")
	public String download(@PathVariable String bookName){
		
		downloadService.downloadBook(bookName);
		return null;
	}
	
	
}
