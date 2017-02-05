/**
 * 
 */
package cn.cuit.lsn.dao;

import java.util.List;

import cn.cuit.lsn.dto.BriefEssaysDto;
import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.pojo.Essays;

/**
 * @author 路双宁
 *
 */
public interface EssaysDao {
	
	/* 保存文章 */
	int save(Essays essays);
	
	/* 按标题查询一篇文章 */
	EssaysDto querryByTitle(String essayTitle);
	
	/* 按ID查询一篇文章 */
	EssaysDto querryByUUID(String essayId);
	
	/* 按权限查询所有文章简介 */
	List<BriefEssaysDto> querryAllEssays(String essayType,int essayPermission);
}
