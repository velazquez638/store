import junit.framework.TestCase;


import store.costumer;

public class costumer_test extends TestCase {

	
	public void test() {
		
		
		costumer test = new costumer ("paco","pepe","luis");
		assertEquals(test.getName(),"paco");
		assertEquals(test.getUser_name(),"pepe");
		assertEquals(test.getEmail(),"paco");
	
		fail("Not yet implemented");
	
		
	}
	
}
