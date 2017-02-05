/**
 * 
 */
package cn.cuit.lsn.service;

import org.springframework.web.multipart.MultipartFile;

import cn.cuit.lsn.dto.BooksDto;

/**
 * @author 路双宁
 *
 */
public interface UploadService {
	public void uploadBook(MultipartFile file);
	public void saveBookInfo(BooksDto booksDto);
	public void uploadSoftware(String softwareName);
}
