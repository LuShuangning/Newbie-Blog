/**
 * 
 */
package cn.cuit.lsn.dao;

import java.util.List;

import cn.cuit.lsn.pojo.Books;

/**
 * @author 路双宁
 *
 */
public interface BooksDao {
	/**
	 * 根据书名查找
	 * @param bookName 书名
	 */
	Books querryBookByName(String bookName);
	
	/**
	 * 查找相同种类的书
	 * @param category 所属类别
	 */
	
	List<Books> querryBookWithType(String category);
}
