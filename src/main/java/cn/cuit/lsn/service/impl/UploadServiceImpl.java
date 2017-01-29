/**
 * 
 */
package cn.cuit.lsn.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import cn.cuit.lsn.service.UploadService;

/**
 * @author 路双宁
 *
 */

@Service("uploadService")
public class UploadServiceImpl implements UploadService {

	@Autowired
	private HttpServletRequest request;
	@Autowired 
	private HttpServletResponse response;
	
	@Override
	public void uploadBook(MultipartFile file) {
		if (!file.isEmpty()) {
			//上传路径
			String path = request.getSession().getServletContext().getRealPath("/WEB-INF/File/");
			String fileName = file.getOriginalFilename();
			
			System.out.println("上传的路径为：" + path);
			
			File targetFile = new File(path, fileName);
			if(!targetFile.exists()){  
	            targetFile.mkdirs();  
	        }
			try {
				file.transferTo(targetFile);
			} catch (IllegalStateException | IOException e) {
				System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<文件上传异常" + e.getMessage());
				e.printStackTrace();
			}
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
	public void uploadSoftware(String softwareName) {
		// TODO Auto-generated method stub

	}

}
