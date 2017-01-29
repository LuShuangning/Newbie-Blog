/**
 * 
 */
package cn.cuit.lsn.dao;


import cn.cuit.lsn.pojo.Essays;

/**
 * @author 路双宁
 *
 */
public interface EssaysDao {
	
	/* 保存文章 */
	int save(Essays essays);
	
	/* 查询文章 */
	Essays querryByTitle(String essayTitle);
	
	Essays querryByUUID(String essayId);
}
