/**
 * 
 */
package cn.cuit.lsn.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.cuit.lsn.controller.back.BackController;
import cn.cuit.lsn.dao.EssaysDao;
import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.pojo.Essays;
import cn.cuit.lsn.service.EssaysService;

/**
 * @author double
 *
 */
@Service("essayService")
public class EssaysServiceImpl implements EssaysService {

	@Autowired EssaysDao essaysDao;
	
	private static final Logger logger = Logger.getLogger(EssaysServiceImpl.class);
	
	@Override
	public void save(EssaysDto essaydto) {
		Essays essays = new Essays();
		/* 将dto转化成pojo */
		essays.setEssayTitle(essaydto.getEssayTitle());
		essays.setEssayAuthor(essaydto.getEssayAuthor());
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
		String json = JSON.toJSONString(essaysDto);
		
		logger.info(json);
		
		return json;
	}
}
