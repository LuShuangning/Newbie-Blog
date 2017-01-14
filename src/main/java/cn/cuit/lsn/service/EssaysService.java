/**
 * 
 */
package cn.cuit.lsn.service;

import cn.cuit.lsn.dto.EssaysDto;
import cn.cuit.lsn.pojo.Essays;

/**
 * @author double
 *
 */
public interface EssaysService {
	public void save(EssaysDto essaydto);
	
	public String querryByTitle(String essayTitle);
}
