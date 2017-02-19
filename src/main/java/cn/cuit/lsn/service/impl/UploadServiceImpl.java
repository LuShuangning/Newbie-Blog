/**
 * 
 */
package cn.cuit.lsn.service.impl;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cn.cuit.lsn.dao.BooksDao;
import cn.cuit.lsn.dao.SoftwareDao;
import cn.cuit.lsn.dto.BooksDto;
import cn.cuit.lsn.dto.SoftwareDto;
import cn.cuit.lsn.pojo.Books;
import cn.cuit.lsn.pojo.Software;
import cn.cuit.lsn.service.UploadService;
import cn.cuit.lsn.util.Upload;

/**
 * @author 路双宁
 *
 */

@Service("uploadService")
public class UploadServiceImpl implements UploadService {
	
	private static final Logger logger = Logger.getLogger(UploadServiceImpl.class);

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private BooksDao booksDao;
	
	@Autowired
	private SoftwareDao softwarDao;
	
	
	@Override
	public void uploadBook(MultipartFile file) {
		if (!file.isEmpty()) {
			//上传路径
//			String path = request.getSession().getServletContext().getRealPath("/WEB-INF/File/");
			String path = "http://www.shuangfile.site/download/";
			String fileName = file.getOriginalFilename();
			
			logger.info("===================上传的路径为：" + path);
			Upload.upload(file, path, fileName);
		}
		
		
		/*多文件上传未实现
		CommonsMultipartResolver commonsMultipartResolver = 
				new CommonsMultipartResolver(request.getSession().getServletContext());
		commonsMultipartResolver.setDefaultEncoding("utf-8");
		if(commonsMultipartResolver.isMultipart(request))
        {
			System.out.println("执行了uploadBook方法");
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = commonsMultipartResolver.resolveMultipart(request);

            Iterator<String> iter = multiRequest.getFileNames();
            while(iter.hasNext())
            {
            	System.out.println("执行了while方法");
                //一次遍历所有文件
                MultipartFile file=multiRequest.getFile(iter.next().toString());
                if(file!=null)
                {
                    String path="E:/上传测试/" ;
                    String fileName = file.getOriginalFilename();
                    System.out.println("文件路径为" + path);
                    //上传
                    try {
						file.transferTo(new File(path,fileName));
					} catch (IllegalStateException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                 
            }
           
        }*/

	}

	@Override
	public void uploadCSS(MultipartFile cssFile) {
		if (!cssFile.isEmpty()) {
			//上传路径
			String path = request.getSession().getServletContext().getRealPath("/static/css/public/");
			String fileName = cssFile.getOriginalFilename();
			
			logger.info("===================上传的路径为：" + path);
			Upload.upload(cssFile, path, fileName);
		}
	}

	/* 保存书籍信息
	 * @see cn.cuit.lsn.service.UploadService#saveBookInfo(cn.cuit.lsn.dto.BooksDto)
	 */
	@Override
	public void saveBookInfo(BooksDto booksDto) {
		Books books = new Books();
		books.setBookId(UUID.randomUUID().toString());
		books.setBookName(booksDto.getBookName());
		books.setAuthorName(booksDto.getAuthorName());
		books.setPress(booksDto.getPress());
		books.setFormat(booksDto.getFormat());
		//FIXME 
		//受前端表单中ng-option的影响，取值总是为"string:安卓",因此存储时将"string:"去掉
		//期待其他的解决方法
		String category = booksDto.getCategory();
		books.setCategory(category.substring(7,category.length()));
		booksDao.saveBookInfo(books);
	}

	/* 保存软件信息
	 * @see cn.cuit.lsn.service.UploadService#saveSoftwareInfo(cn.cuit.lsn.dto.SoftwareDto)
	 */
	@Override
	public void saveSoftwareInfo(SoftwareDto softwareDto) {
		Software soft = new Software();
		soft.setId(UUID.randomUUID().toString());
		soft.setSoftwareName(softwareDto.getSoftwareName());
		soft.setSoftwareVersion(softwareDto.getSoftwareVersion());
		String category = softwareDto.getCategory();
		soft.setCategory(category.substring(7,category.length()));
		soft.setSoftwareIntro(softwareDto.getSoftwareIntro());
		soft.setDownloadLink(softwareDto.getDownloadLink());
		softwarDao.saveInfo(soft);
		
	}

}
