/**
 * 
 */
package cn.cuit.lsn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;

import cn.cuit.lsn.dao.AlbumDao;
import cn.cuit.lsn.service.NotesService;

/**
 * @author 路双宁
 *
 */

@Service("notesService")
public class NotesServiceImpl implements NotesService {
	
	@Autowired private AlbumDao albumDao;

	/* 
	 * @see cn.cuit.lsn.service.NotesService#querryAlbum()
	 */
	@Override
	public String querryAlbum() {
		String json = JSON.toJSONString(albumDao.querryAlbum());
		return json;
	}

	/* 
	 * @see cn.cuit.lsn.service.NotesService#querryDetial()
	 */
	@Override
	public String querryDetail(String belongTo) {
		
		return JSON.toJSONString(albumDao.querryDetail(belongTo));
	}
	
	

}
