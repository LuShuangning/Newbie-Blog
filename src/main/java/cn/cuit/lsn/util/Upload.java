/**
 * 
 */
package cn.cuit.lsn.util;

import java.io.File;
import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author 路双宁
 *
 */
public class Upload {
	
	public static void upload(MultipartFile file,String path,String fileName){
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
}
