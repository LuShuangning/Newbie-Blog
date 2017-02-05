/**
 * 
 */
package cn.cuit.lsn.pojo;

import java.util.Date;

/**
 * @author 路双宁
 *
 */
public class Essays {
	private String essayId;
	
	private String essayTitle;
	
	private String essayAuthor;
	
	private Date createTime;
	
	private String essayContent;
	
	private int essayPermission;
	
	private String essayType;
	
	private String essayBrief;

	public String getEssayBrief() {
		return essayBrief;
	}

	public void setEssayBrief(String essayBrief) {
		this.essayBrief = essayBrief;
	}

	public String getEssayType() {
		return essayType;
	}

	public void setEssayType(String essayType) {
		this.essayType = essayType;
	}

	public int getEssayPermission() {
		return essayPermission;
	}

	public void setEssayPermission(int essayPermission) {
		this.essayPermission = essayPermission;
	}

	public String getEssayId() {
		return essayId;
	}

	public void setEssayId(String essayId) {
		this.essayId = essayId;
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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEssayContent() {
		return essayContent;
	}

	public void setEssayContent(String essayContent) {
		this.essayContent = essayContent;
	}
	
	
	
}
