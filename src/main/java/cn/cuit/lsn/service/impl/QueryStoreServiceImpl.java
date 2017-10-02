/**
 * 
 */
package cn.cuit.lsn.service.impl;

import java.util.List;

import cn.cuit.lsn.service.QueryStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.cuit.lsn.dao.BooksDao;
import cn.cuit.lsn.dao.SoftwareDao;
import cn.cuit.lsn.dto.BooksDto;
import cn.cuit.lsn.dto.SoftwareDto;

/**
 * @author 路双宁
 *
 */

@Service("queryStoreService")
public class QueryStoreServiceImpl implements QueryStoreService {

	@Autowired 
	private BooksDao booksDao;
	
	@Autowired 
	private SoftwareDao softwareDao;
	/* 
	 * @see cn.cuit.lsn.service.QueryBooksService#querryByType(java.lang.String)
	 */
	@Override
	public String queryBooks(String category) {
		
//		List<BooksDto> bookList = booksDao.queryBooksWithType(category);
		List<BooksDto> bookList = booksDao.queryAllBooks();
		String json = JSON.toJSONString(bookList);
		System.out.println(json);
		
		return json;
	}
	/* 
	 * @see cn.cuit.lsn.service.QueryStoreService#querySoftware(java.lang.String)
	 */
	@Override
	public String querySoftware(String category) {
		List<SoftwareDto> softwareDto = softwareDao.querryAll();
		String json = JSON.toJSONString(softwareDto);
		return json;
	}

}
