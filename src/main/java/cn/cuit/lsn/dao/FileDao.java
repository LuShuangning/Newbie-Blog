package cn.cuit.lsn.dao;

import java.util.List;

import cn.cuit.lsn.entity.MyFile;

public interface FileDao {
	/**
	 * 根据文件名查找文件
	 * @param fileName
	 * @return
	 */
	MyFile querryFileByName(String fileName);
	
	/**
	 * 查找相同类型的文件
	 * @param fileType
	 * @return
	 */
	List<MyFile> querryFileWithType(int fileType);
	
	/**
	 * 查找所有文件
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<MyFile> querryAllFile(int offset,int limit);
	
	/**
	 * 添加文件
	 * @param fileName
	 * @param fileType
	 * @param fileLoc
	 * @return
	 */
	int insertFile(String fileName,int fileType,String fileLoc);
	
}
