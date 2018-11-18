package store;

public class costumer {
	
	 private String name = " ";
	 private String user_name = " ";
	 private String email = " ";
	
	public costumer(String name1, String user_name1, String email1) {	
		this.name=name1;
		this.user_name=user_name1;
		this.email=email1;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name2) {
		this.name = name2;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name2) {
		user_name = user_name2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email2) {
		email = email2;
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
