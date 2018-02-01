/**
 * 
 */
package cn.cuit.lsn.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

/**
 * @author 路双宁
 *@version 0.2.0
 */
public class RemoveHtmlLabel {
	
	private static final Logger logger = Logger.getLogger(RemoveHtmlLabel.class);
	
	/**
	 *
	 * @return 转换之后的纯文本
	 */
	public static String removeHtmlLabel(String content){
//		String regex="([\u4e00-\u9fa5]+)";
		int length = content.length();
		String transfer = null;
		/* 将content缩减 */
		if (length < 300) {
			transfer = content;
		}else {
//			int end = (int)content.length()/10;
			transfer = content.substring(0,300);
		}
		
//		Matcher matcher = Pattern.compile(regex).matcher(transfer);
//		if (matcher.find()) {
//			String brief = matcher.group(0);
//			return brief;
//		}else{
//			return null;
//		}
		
		return transfer;
		
	}
}
