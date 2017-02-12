/**
 * 
 */
package cn.cuit.lsn.dao;

import java.util.List;

import cn.cuit.lsn.dto.SoftwareDto;
import cn.cuit.lsn.pojo.Software;

/**
 * @author 路双宁
 *
 */
public interface SoftwareDao {

	/*
	 * 按软件名查询
	 */
	SoftwareDto querryByName(String softwareName);
	
	
	/*
	 * 按类型查询
	 */
	List<SoftwareDto> querryByType(String category);
	
	
	/*
	 * 查询所有软件
	 */
	List<SoftwareDto> querryAll();
	
	/*
	 * 保存软件信息
	 */
	int saveInfo(Software software);
}
