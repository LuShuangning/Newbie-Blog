/**
 * 
 */
package cn.cuit.lsn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.cuit.lsn.dao.BooksDao;
import cn.cuit.lsn.dto.BooksDto;
import cn.cuit.lsn.pojo.Books;
import cn.cuit.lsn.service.QuerryBooksService;

/**
 * @author 路双宁
 *
 */

@Service("querryBooksService")
public class QuerryBooksServiceImpl implements QuerryBooksService{

	@Autowired 
	private BooksDao booksDao;
	/* 
	 * @see cn.cuit.lsn.service.QuerryBooksService#querryByType(java.lang.String)
	 */
	@Override
	public String querry(String category) {
		
		List<BooksDto> bookList = booksDao.querryBookWithType(category);
		String json = JSON.toJSONString(bookList);
		System.out.println(json);
		
		return json;
	}

}
