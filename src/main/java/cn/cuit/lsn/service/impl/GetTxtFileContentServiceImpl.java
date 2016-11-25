package cn.cuit.lsn.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cuit.lsn.dao.FileDao;
import cn.cuit.lsn.entity.MyFile;
import cn.cuit.lsn.service.GetTxtFileContentService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


/**
 * 读取数据库中txt文件存放的路径，通过IO操作获得txt文件内容并用json按行封装
 * @author 路双宁
 * @version 0.2.0
 */

@Service
public class GetTxtFileContentServiceImpl implements GetTxtFileContentService{

	@Autowired
	private FileDao fileDao;
	
	/**
	 * 通过数据库查询该文件的信息
	 * @param String fileName 文件名
	 * @return MyFile 该文件对应的entity
	 */
	@Override
	public MyFile readFile(String fileName) {
		long start = System.nanoTime();
		MyFile myFile = fileDao.querryFileByName(fileName);
		System.out.println("查询数据库耗时：" + (System.nanoTime() - start) + "纳秒");
		return myFile;
	}
	
	/**
	 * IO操作获取txt文件内容
	 * @param String fileLoc 文件路径
	 * @return StringBuffer txt文件的内容
	 */
	
	@Override
	public StringBuffer getContent(String fileLoc){
		BufferedReader br = null;
		StringBuffer content = new StringBuffer();
		String stringLine = null;
		try {
			
			File file = new File(fileLoc);
			br = new BufferedReader(new FileReader(file));
			while ((stringLine = br.readLine()) != null) {
				content.append(stringLine + " ");
			}
						
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
		return content;
	}
	
	/**
	 * @param String fileName 文件名
	 * @return JSONArray 封装好的json对象
	 *
	 */

	@Override
	public JSONArray contentPackaged(String fileName) {
		
		StringTokenizer fx = null;
		StringBuffer content = new StringBuffer();
		MyFile myFile = null;
		List<String> list = new ArrayList<>();
		
		//读取文件
		myFile = readFile(fileName);
		//IO操作读取文件内容
		content = getContent(myFile.getFileLoc());
		//默认使用空格来进行分割
		fx = new StringTokenizer(content.toString());
		
		while(fx.hasMoreTokens()){

			list.add(fx.nextToken());
			
		}
		JSONArray json = JSONArray.fromObject(list);
		System.out.println(json.toString());
		
		return json;
	}
	
	
	
	
	
	

	
}
