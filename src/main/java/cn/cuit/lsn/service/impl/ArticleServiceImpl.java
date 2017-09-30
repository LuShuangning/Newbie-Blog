/**
 * 
 */
package cn.cuit.lsn.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import cn.cuit.lsn.pojo.Article;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.cuit.lsn.dao.ArticlesDao;
import cn.cuit.lsn.dto.ArticleBriefDto;
import cn.cuit.lsn.dto.ArticleDto;
import cn.cuit.lsn.service.ArticleService;
import cn.cuit.lsn.util.RemoveHtmlLabel;

/**
 * @author 路双宁
 *
 */

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {

	@Autowired private ArticlesDao articlesDao;
	
	private static final Logger logger = Logger.getLogger(ArticleServiceImpl.class);
	
	@Override
	public Map<String, String> queryByID(Integer articleId) {
		logger.info("======================传进来的ID为" + articleId);
		Map<String, String> map = new HashMap<>();
		ArticleDto articleDto = articlesDao.queryByID(articleId);
		if (articleDto != null) {
			map.put("author", articleDto.getArticleAuthor());
			map.put("content", articleDto.getArticleContent());
			map.put("id", articleDto.getArticleId());
			map.put("title", articleDto.getArticleTitle());
			map.put("createTime", 
					new SimpleDateFormat("yy-MM-dd").format(articleDto.getCreateTime()));
			
			map.put("type", articleDto.getArticleType());
			map.put("permission", String.valueOf(articleDto.getArticlePermission()));
			return map;
		}else{
			return null;
		}
		
	}
	
	@Override
	public void save(ArticleDto articledto) {
		Article article = new Article();
		/* 将dto转化成pojo */
//		article.setArticleId(UUID.randomUUID().toString());
		article.setArticleTitle(articledto.getArticleTitle());
		article.setArticleAuthor(articledto.getArticleAuthor());
		article.setArticlePermission(articledto.getArticlePermission());
		article.setArticleType(articledto.getArticleType());
		String content = articledto.getArticleContent();
		article.setArticleContent(content);
		String brief = RemoveHtmlLabel.removeHtmlLabel(content);
		article.setArticleBrief(brief);
		articlesDao.save(article);
	}

	@Override
	public String queryByTitle(String articleTitle) {
		logger.info("=================title为" + articleTitle);
		ArticleDto articleDto = articlesDao.queryByTitle(articleTitle);
		String json = JSON.toJSONString(articleDto);
		logger.info("=================所有的文章：" + json);
		return json;
	}

	/** 根据权限查询所有相同类型的文章
	 * @param articleType 文章类型
	 * @return json
	 */
	@Override
	public List<ArticleBriefDto> queryAll(String articleType,Integer pageNum,Integer pageSize) {

//		logger.info("======================传进来的articleType为" + articleType);
//		System.out.println("======================传进来的articleType为" + articleType);

		PageHelper.startPage(pageNum, pageSize);
		List<ArticleBriefDto> list = articlesDao.queryAllArticles(articleType);
//		PageInfo<ArticleBriefDto> page = new PageInfo<>(list);

//		String json = JSON.toJSONString(list);
		return list;
	}
}
