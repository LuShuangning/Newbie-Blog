/**
 * 
 */
package cn.cuit.lsn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.cuit.lsn.dao.BooksDao;
import cn.cuit.lsn.dao.SoftwareDao;
import cn.cuit.lsn.dto.BooksDto;
import cn.cuit.lsn.dto.SoftwareDto;
import cn.cuit.lsn.service.QuerryStoreService;

/**
 * @author 路双宁
 *
 */

@Service("querryStoreService")
public class QuerryStoreServiceImpl implements QuerryStoreService{

	@Autowired 
	private BooksDao booksDao;
	
	@Autowired 
	private SoftwareDao softwareDao;
	/* 
	 * @see cn.cuit.lsn.service.QuerryBooksService#querryByType(java.lang.String)
	 */
	@Override
	public String querryBooks(String category) {
		
//		List<BooksDto> bookList = booksDao.querryBooksWithType(category);
		List<BooksDto> bookList = booksDao.querryAllBooks();
		String json = JSON.toJSONString(bookList);
		System.out.println(json);
		
		return json;
	}
	/* 
	 * @see cn.cuit.lsn.service.QuerryStoreService#querrySoftware(java.lang.String)
	 */
	@Override
	public String querrySoftware(String category) {
		List<SoftwareDto> softwareDto = softwareDao.querryAll();
		String json = JSON.toJSONString(softwareDto);
		return json;
	}

}
