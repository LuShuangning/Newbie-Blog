/**
 * 
 */
package cn.cuit.lsn.service.impl;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.cuit.lsn.dao.EssaysDao;
import cn.cuit.lsn.dto.BriefEssaysDto;
import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.pojo.Essays;
import cn.cuit.lsn.service.EssaysService;
import cn.cuit.lsn.util.RemoveHtmlLabel;

/**
 * @author 路双宁
 *
 */
@Service("essayService")
public class EssaysServiceImpl implements EssaysService {

	@Autowired private EssaysDao essaysDao;
	
	private static final Logger logger = Logger.getLogger(EssaysServiceImpl.class);
	
	@Override
	public Map<String, String> querryByUUID(String essayId) {
		logger.info("======================传进来的ID为" + essayId);
		Map<String, String> map = new HashMap<>();
		EssaysDto essaysDto = essaysDao.querryByUUID(essayId);
		if (essaysDto != null) {
			map.put("author", essaysDto.getEssayAuthor());
			map.put("content", essaysDto.getEssayContent());
			map.put("id", essaysDto.getEssayId());
			map.put("title", essaysDto.getEssayTitle());
			map.put("createTime", 
					new SimpleDateFormat("yyyy-MM-dd").format(essaysDto.getCreateTime()));
			
			map.put("type", essaysDto.getEssayType());
			map.put("permission", String.valueOf(essaysDto.getEssayPermission()));
			return map;
		}else{
			return null;
		}
		
		
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
		String content = essaydto.getEssayContent();
		essays.setEssayContent(content);
		String brief = RemoveHtmlLabel.removeHtmlLabel(content);
		essays.setEssayBrief(brief);
		essaysDao.save(essays);
	}

	@Override
	public String querryByTitle(String essayTitle) {
		logger.info("=================title为" + essayTitle);
		EssaysDto essaysDto = essaysDao.querryByTitle(essayTitle);
		String json = JSON.toJSONString(essaysDto);
		return json;
	}

	/* (non-Javadoc)
	 * @see cn.cuit.lsn.service.EssaysService#querryAll()
	 */
	@Override
	public String querryAll(String essayType,int essayPermission) {
//		logger.info("======================传进来的category为" + category);
		List<BriefEssaysDto> list = essaysDao.querryAllEssays(essayType,essayPermission);
		String json = JSON.toJSONString(list);
		logger.info("=================所有的文章：" + json);
		return json;
	}
}
