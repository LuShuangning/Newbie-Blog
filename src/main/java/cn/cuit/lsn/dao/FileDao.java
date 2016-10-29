package cn.cuit.lsn.dao;

import java.util.List;

import cn.cuit.lsn.entity.File;

public interface FileDao {
	/**
	 * 根据文件名查找文件
	 * @param fileName
	 * @return
	 */
	File querryByFileName(String fileName);
	
	/**
	 * 查找相同类型的文件
	 * @param fileType
	 * @return
	 */
	List<File> querryFileWithType(int fileType);
	
	/**
	 * 查找所有文件
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<File> querryAll(int offset,int limit);
	
	/**
	 * 添加文件
	 * @param fileName
	 * @param fileType
	 * @param fileLoc
	 * @return
	 */
	int insertFile(String fileName,int fileType,String fileLoc);
	
}
