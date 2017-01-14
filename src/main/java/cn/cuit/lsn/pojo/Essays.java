/**
 * 
 */
package cn.cuit.lsn.pojo;

import java.util.Date;

/**
 * @author double
 *
 */
public class Essays {
	private Long essayId;
	
	private String essayTitle;
	
	private String essayAuthor;
	
	private Date createTime;
	
	private String essayContent;

	public Long getEssayId() {
		return essayId;
	}

	public void setEssayId(Long essayId) {
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
