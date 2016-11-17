package cn.cuit.lsn.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cuit.lsn.dao.FileDao;
import cn.cuit.lsn.entity.MyFile;
import cn.cuit.lsn.service.GetTxtFileContentService;

@Service
public class GetTxtFileContentServiceImpl implements GetTxtFileContentService{

	@Autowired
	private FileDao fileDao;

	
	@Override
	public String getContent(String fileName){
		File file = new File(readFile(fileName).getFileLoc());
		BufferedReader br = null;
		StringBuilder content = new StringBuilder();
		String stringLine = null;

		try {
			br = new BufferedReader(new FileReader(file));
			while ((stringLine = br.readLine()) != null) {
				content.append(stringLine);
			}
			System.out.println(content);
		} catch (FileNotFoundException e) {
			System.out.println("未找到文件：" + e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("文件IO操作异常：" + e.getMessage());
		}finally{
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
		return null;
	}
	
	
	public MyFile readFile(String fileName) {
		
		return fileDao.querryFileByName(fileName);
	}
	
	
	
}
