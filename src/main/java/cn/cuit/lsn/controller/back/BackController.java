package cn.cuit.lsn.controller.back;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.cuit.lsn.dto.BooksDto;
import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.dto.SoftwareDto;
import cn.cuit.lsn.service.EssaysService;
import cn.cuit.lsn.service.UploadService;


@Controller
@RequestMapping("/back")
public class BackController {
	@Autowired EssaysService essayService;
	@Autowired UploadService uploadService;
	
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
	
	@RequestMapping("/books/upload")
	public void upload(
			@RequestParam("file") MultipartFile file,
			BooksDto booksDto){
		
		logger.info(
				"表单里的bookName为" + booksDto.getBookName()
				+ ",书籍分类为" + booksDto.getCategory()
				+ ",作者为" + booksDto.getAuthorName()
				+ ",出版社为" + booksDto.getPress());
		uploadService.uploadBook(file); 
		
		System.out.println("上传成功");
	}
	
	@RequestMapping("/software/save")
	public void softwareSave(SoftwareDto softwareDto) {
		logger.info(
				"表单里的SoftwareName为" + softwareDto.getSoftwareName()
				+ ",软件分类为" + softwareDto.getCategory()
				+ ",版本为" + softwareDto.getSoftwareVersion()
				+ ",下载链接为" + softwareDto.getDownloadLink()
				+ ",软件简介为" + softwareDto.getSoftwareIntro());
	}
}
