/**
 * 
 */
package cn.cuit.lsn.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

/**
 * @author 路双宁
 *@version 0.1.0
 */
public class RemoveHtmlLabel {
	
	private static final Logger logger = Logger.getLogger(RemoveHtmlLabel.class);
	
	/**
	 * 
	 * @param 包含HTML标签的文章内容
	 * @return 转换之后的纯文本
	 */
	public static String removeHtmlLabel(String content){
		String regex="([\u4e00-\u9fa5]+)";
		int length = content.length();
		String transfer = null;
		/* 将content缩减 */
		if (length < 50) {
			transfer = content.substring(0,length);
		}else {
			int end = (int)content.length()/10;
			transfer = content.substring(0,end);
		}
		
		Matcher matcher = Pattern.compile(regex).matcher(transfer);
		if (matcher.find()) {
			String brief = matcher.group(0);
			logger.info("===========================转换之后的brief为" + brief);
			return brief;
		}else{
			logger.info("===========================现在的brief为null");
			return null;
		}
	}
}
