/**
 * 
 */
package cn.cuit.lsn.service;


import java.util.List;
import java.util.Map;

import cn.cuit.lsn.dto.ArticleBriefDto;
import cn.cuit.lsn.dto.ArticleDto;
import com.github.pagehelper.PageInfo;


/**
 * @author 路双宁
 *
 */

public interface ArticleService {
	void save(ArticleDto articledto);
	
	String queryByTitle(String articleTitle);
	
	Map<String, String> queryByUUID(String articleId);
	
	//FIXME 待修改为MyBatis分页查询
	List<ArticleBriefDto> queryAll(String category, Integer pageNum, Integer pageSize);
}
