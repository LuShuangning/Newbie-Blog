package cn.cuit.lsn.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import cn.cuit.lsn.service.DownloadBooksService;

public class DownloadBooksServiceImpl implements DownloadBooksService {
	@Autowired HttpServletRequest request;
	@Autowired HttpServletResponse response;

	@Override
	public void downloadBook(String bookName) {
		
		response.setContentType("application/force-download");
		response.setCharacterEncoding("utf-8");
		response.addHeader("Content-Disposition",
				"attachment;fileName=" + bookName);// 设置文件名
		
		if (bookName != null) {
			String path = request
						.getServletContext()
						.getRealPath("WEB-INF/File/");
			
			System.out.println("Book的路径为" + path);
			
			try {
				InputStream inputStream = 
						new FileInputStream(
								new File(path,bookName));
				
				OutputStream os = response.getOutputStream();
				
				byte[] b = new byte[2048];
				int length;
				while ((length = inputStream.read(b)) > 0) {
					os.write(b, 0, length);
				}
				
				os.close();
				inputStream.close();
				
			} catch (FileNotFoundException e) {
				System.out.println("文件没有找到：" + e.getMessage());
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("文件IO操作异常" + e.getMessage());
				e.printStackTrace();
			}
		}
	}
	
	
	
}
