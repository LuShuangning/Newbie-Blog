/**
 * 
 */
package cn.cuit.lsn.dto;

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
