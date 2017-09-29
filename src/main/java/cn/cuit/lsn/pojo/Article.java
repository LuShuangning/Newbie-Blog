/**
 * 
 */
package cn.cuit.lsn.pojo;

import java.util.Date;

/**
 * @author 路双宁
 *
 */
public class Article {
	private String articleId;
	
	private String articleTitle;
	
	private String articleAuthor;
	
	private Date createTime;
	
	private String articleContent;
	
	private int articlePermission;
	
	private String articleType;
	
	private String articleBrief;

	public String getArticleBrief() {
		return articleBrief;
	}

	public void setArticleBrief(String essayBrief) {
		this.articleBrief = articleBrief;
	}

	public String getArticleType() {
		return articleType;
	}

	public void setArticleType(String essayType) {
		this.articleType = articleType;
	}

	public int getArticlePermission() {
		return articlePermission;
	}

	public void setArticlePermission(int essayPermission) {
		this.articlePermission = articlePermission;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String essayId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String essayTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleAuthor() {
		return articleAuthor;
	}

	public void setArticleAuthor(String essayAuthor) {
		this.articleAuthor = articleAuthor;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String essayContent) {
		this.articleContent = articleContent;
	}
	
	
	
}
