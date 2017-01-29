/**
 * 
 */
package cn.cuit.lsn.dto;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author double
 * DTO 用于表现层和业务层之间的数据传输，因其可以不暴露数据表的表结构。
 * 每个DTO要有一个默认的无参构造方法
 *
 */
public class EssaysDto {
	private String essayTitle;
	
	private String essayAuthor;

    private String essayContent;
    
    private int essayPermission;
    
    @JSONField(format = "yyyy-MM-dd")
    private Date createTime;
    
    private String essayType;
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getEssayPermission() {
		return essayPermission;
	}

	public void setEssayPermission(int essayPermission) {
		this.essayPermission = essayPermission;
	}

	public String getEssayType() {
		return essayType;
	}

	public void setEssayType(String essayType) {
		this.essayType = essayType;
	}

	
    
    public EssaysDto(){}

	public String getEssayTitle() {
		return essayTitle;
	}

	public void setEssayTitle(String essayTitle) {
		this.essayTitle = essayTitle;
	}

	public String getEssayAuthor() {
		return essayAuthor;
	}

	public void setEssayAuthor(String essayAuthor) {
		this.essayAuthor = essayAuthor;
	}

	public String getEssayContent() {
		return essayContent;
	}

	public void setEssayContent(String essayContent) {
		this.essayContent = essayContent;
	}
    
    

}
