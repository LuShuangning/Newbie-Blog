/**
 * 
 */
package cn.cuit.lsn.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import cn.cuit.lsn.dto.BooksDto;
import cn.cuit.lsn.dto.SoftwareDto;

/**
 * @author 路双宁
 *
 */
public interface UploadService {
	public void uploadBook(MultipartFile file);
	public void saveBookInfo(BooksDto booksDto);
	public void uploadCSS(MultipartFile cssFile);
	public void saveSoftwareInfo(SoftwareDto softwareDto);
}
