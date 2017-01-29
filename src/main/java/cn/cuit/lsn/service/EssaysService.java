/**
 * 
 */
package cn.cuit.lsn.service;

import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.pojo.Essays;

/**
 * @author 路双宁
 *
 */
public interface EssaysService {
	public void save(EssaysDto essaydto);
	
	public String querryByTitle(String essayTitle);
	
	public String querryByUUID(String essayId);
}
