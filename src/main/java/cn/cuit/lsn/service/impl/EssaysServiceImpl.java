/**
 * 
 */
package cn.cuit.lsn.service.impl;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.cuit.lsn.dao.EssaysDao;
import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.pojo.Essays;
import cn.cuit.lsn.service.EssaysService;

/**
 * @author 路双宁
 *
 */
@Service("essayService")
public class EssaysServiceImpl implements EssaysService {

	@Autowired EssaysDao essaysDao;
	
	private static final Logger logger = Logger.getLogger(EssaysServiceImpl.class);
	
	@Override
	public String querryByUUID(String essayId) {
		logger.info("======================传进来的ID为" + essayId);
		Essays essays = essaysDao.querryByUUID(essayId);
		EssaysDto essaysDto = new EssaysDto();
		/* 将pojo转化成dto */
		essaysDto.setEssayTitle(essays.getEssayTitle());
		essaysDto.setEssayAuthor(essays.getEssayAuthor());
		essaysDto.setEssayContent(essays.getEssayContent());
		essaysDto.setCreateTime(essays.getCreateTime());
		String json = JSON.toJSONString(essaysDto);
		
		return json;
	}

	
	
	@Override
	public void save(EssaysDto essaydto) {
		Essays essays = new Essays();
		/* 将dto转化成pojo */
		essays.setEssayId(UUID.randomUUID().toString());
		essays.setEssayTitle(essaydto.getEssayTitle());
		essays.setEssayAuthor(essaydto.getEssayAuthor());
		essays.setEssayPermission(essaydto.getEssayPermission());
		essays.setEssayType(essaydto.getEssayType());
		essays.setEssayContent(essaydto.getEssayContent());
		
		essaysDao.save(essays);
	}

	@Override
	public String querryByTitle(String essayTitle) {
		Essays essays = essaysDao.querryByTitle(essayTitle);
		EssaysDto essaysDto = new EssaysDto();
		/* 将pojo转化成dto */
		essaysDto.setEssayTitle(essays.getEssayTitle());
		essaysDto.setEssayAuthor(essays.getEssayAuthor());
		essaysDto.setEssayContent(essays.getEssayContent());
		essaysDto.setCreateTime(essays.getCreateTime());
//		String jString = JSON.toJSONStringWithDateFormat(essays.getCreateTime(), "yyyy-MM-dd");
		String json = JSON.toJSONString(essaysDto);
		return json;
	}
}
