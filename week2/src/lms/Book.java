package lms;

public class Book {
	private String name;
	private User user;
	
	{
		user = null;
	}
	
	public Book(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setUser(User u) {
		this.user = u;
	}
}
