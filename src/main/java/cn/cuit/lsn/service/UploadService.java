/**
 * 
 */
package cn.cuit.lsn.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author 路双宁
 *
 */
public interface UploadService {
	public void uploadBook(MultipartFile file);
	public void uploadSoftware(String softwareName);
}
