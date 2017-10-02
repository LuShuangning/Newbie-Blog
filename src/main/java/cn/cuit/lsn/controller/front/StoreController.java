package cn.cuit.lsn.controller.front;

import cn.cuit.lsn.service.QueryStoreService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cuit.lsn.service.DownloadService;

@Controller
@RequestMapping("/store")
public class StoreController {
	@Autowired 
	private DownloadService downloadService;
	@Autowired 
	private QueryStoreService queryStoreService;
	
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(StoreController.class);
	
	@RequestMapping("/show")
	public String requestIndex(){
		
		return "store/store";
	}
	
	/*
	 * 此RequestMapping解决服务端往前台发送数据出现中文乱码的问题，produces是重点
	 */
	@RequestMapping(value = "/books/list",produces = "application/json;charset=utf-8")
	public @ResponseBody String bookList(@RequestParam String category){
		System.out.println("查询的类型为：" + category);
		String json = queryStoreService.queryBooks(category);
		
		return json;
	}
	
	//REST风格的传参方式
	@RequestMapping("/books/{bookName}/{format}")
	public String download(@PathVariable String bookName,
			@PathVariable String format){
		//拼接书籍的文件名
		bookName = bookName + "." + format;
		int status = downloadService.downloadBook(bookName);
		switch (status) {
			case -1:
				return "redirect:error/404";
			case 0:
				return "redirect:error/500";
		}
		return null;
	}
	
	@RequestMapping(value = "/software/list",produces = "application/json;charset=utf-8")
	public @ResponseBody String softwareList(@RequestParam String category){
		String json = queryStoreService.querySoftware(category);
		
		return json;
	}
	
}