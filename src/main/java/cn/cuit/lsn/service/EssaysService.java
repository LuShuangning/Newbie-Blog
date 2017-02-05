/**
 * 
 */
package cn.cuit.lsn.service;

import java.util.Map;

import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.pojo.Essays;

/**
 * @author 路双宁
 *
 */
public interface EssaysService {
	public void save(EssaysDto essaydto);
	
	public String querryByTitle(String essayTitle);
	
	public Map<String, String> querryByUUID(String essayId);
	
	//FIXME 待修改为MyBatis分页查询
	public String querryAll(String category,int permission);
}
