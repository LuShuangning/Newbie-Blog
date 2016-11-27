package cn.cuit.lsn.service;
import cn.cuit.lsn.pojo.MyFile;

public interface GetTxtFileContentService {
	public StringBuffer getContent(String fileName);
	public MyFile readFile(String fileName);
	public String contentPackaged(String fileName);
}
