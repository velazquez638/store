package store;

public class costumer {
	
	protected  String name = " ";
	protected String user_name = " ";
	protected String email = " ";
	
	public costumer(String name1, String user_name1, String email1) {	
		name=name1;
		user_name=user_name1;
		email=email1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getUser_name() {
		return user_name;
	}

	public String getEmail() {
		return email;
	}

}
