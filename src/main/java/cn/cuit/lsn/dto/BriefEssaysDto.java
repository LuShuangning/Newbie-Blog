/**
 * 
 */
package cn.cuit.lsn.dto;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author 路双宁
 * DTO 用于表现层和业务层之间的数据传输，因其可以不暴露数据表的表结构。
 * 每个DTO要有一个默认的无参构造方法
 *
 */
public class BriefEssaysDto {
	private String essayId;
	
	private String essayTitle;
	
	private String essayAuthor;
	
	@JSONField(format = "yy-MM-dd")
    private Date createTime;
    
    private String essayBrief;

    public BriefEssaysDto(){}
    
	public String getEssayId() {
		return essayId;
	}


	public void setEssayId(String essayId) {
		this.essayId = essayId;
	}

	public String getEssayBrief() {
		return essayBrief;
	}

	public void setEssayBrief(String essayBrief) {
		this.essayBrief = essayBrief;
	}
    
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

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
}
