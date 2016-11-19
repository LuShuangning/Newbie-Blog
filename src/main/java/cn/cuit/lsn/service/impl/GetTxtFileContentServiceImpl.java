package cn.cuit.lsn.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cuit.lsn.dao.FileDao;
import cn.cuit.lsn.entity.MyFile;
import cn.cuit.lsn.service.GetTxtFileContentService;


/**
 * 通过数据库中txt文件存放的路径来读取txt文件内容并用字符串处理将其处理
 * @author 路双宁
 * @version 0.1.0
 */

@Service
public class GetTxtFileContentServiceImpl implements GetTxtFileContentService{

	@Autowired
	private FileDao fileDao;
	
	/**
	 * io操作获取txt文件内容并用StringTokenizer处理
	 * @param fileName 文件名
	 */
	
	@Override
	public StringTokenizer getContent(String fileName){
		BufferedReader br = null;
		StringBuffer content = new StringBuffer();
		String stringLine = null;
		StringTokenizer fx = null;
		long start = System.nanoTime();
		try {
			
			File file = new File(readFile(fileName).getFileLoc());
			br = new BufferedReader(new FileReader(file));
			while ((stringLine = br.readLine()) != null) {
				content.append(stringLine + " ");
			}
			//默认使用空格来进行分割
			fx = new StringTokenizer(content.toString());
			
			
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
			System.out.println("读取txt文件耗时："+ (System.nanoTime() - start) + "纳秒");
		}
		return fx;
	}
	
	/**
	 * 通过数据库查询该文件的信息
	 * @param fileName 文件名
	 * @return 该文件对应的entity
	 */
	public MyFile readFile(String fileName) {
		long start = System.nanoTime();
		MyFile myFile = fileDao.querryFileByName(fileName);
		System.out.println("查询数据库耗时：" + (System.nanoTime() - start) + "纳秒");
		return myFile;
	}

	
}
