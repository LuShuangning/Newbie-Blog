package cn.cuit.lsn.service;

import cn.cuit.lsn.entity.MyFile;
import net.sf.json.JSONArray;

public interface GetTxtFileContentService {
	public StringBuffer getContent(String fileName);
	public MyFile readFile(String fileName);
	public JSONArray contentPackaged(String fileName);
}
