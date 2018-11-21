package store;

public class costumer {
	
	protected  String name = " ";
	protected String user_name = " ";
	protected String email = " ";
	
	protected costumer(String name1, String user_name1, String email1) {	
		name=name1;
		user_name=user_name1;
		email=email1;
	}
	
	protected String getName() {
		return this.name;
	}
	
	protected String getUser_name() {
		return user_name;
	}

	protected String getEmail() {
		return email;
	}

}
