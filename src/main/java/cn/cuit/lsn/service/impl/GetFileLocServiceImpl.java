package cn.cuit.lsn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cuit.lsn.dao.FileDao;
import cn.cuit.lsn.entity.File;
import cn.cuit.lsn.service.GetFileLocService;

@Service
public class GetFileLocServiceImpl implements GetFileLocService {

	@Autowired
	private FileDao fileDao;
	@Override
	public File readFile() {
		
		return fileDao.querryFileByName("test");
	}
	
	
}
