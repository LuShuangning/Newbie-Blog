/**
 * 
 */
package cn.cuit.lsn.dto;

/**
 * @author 路双宁
 *
 */
public class BooksDto {
	
	private String bookName;
	
	private String authorName;
	
	private String press;
	
	private String category;
	
	public BooksDto(){};
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
