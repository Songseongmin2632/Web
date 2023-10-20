package c231020.board;

import java.sql.Date;

import c231019.user.UserBean;

public class BoardBean {
	private int id;
	private int userId;
	private UserBean user;
	private String title;
	private String content;
	private Date createdAt;
	
	public BoardBean() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	
	public int getId() {
		return id;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public UserBean getUser() {
		return user;
	}
}


