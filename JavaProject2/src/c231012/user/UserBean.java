package c231012.user;

//유저에 대한 데이터를 프로그램 내에 저장하는 클래스
public class UserBean {
	private int id;
	private String name;
	private String userId;
	private String password;
	
public UserBean() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
}
