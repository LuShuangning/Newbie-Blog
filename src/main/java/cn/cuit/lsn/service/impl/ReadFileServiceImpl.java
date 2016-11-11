package cn.cuit.lsn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cuit.lsn.dao.FileDao;
import cn.cuit.lsn.entity.File;
import cn.cuit.lsn.service.ReadFileService;

@Service
public class ReadFileServiceImpl implements ReadFileService {

	@Autowired
	private FileDao fileDao;
	@Override
	public File readFile() {
		fileDao.querryFileByName("test");
		return null;
	}
	
	
}
