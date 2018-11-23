import junit.framework.TestCase;
import store.inter;

public class inter_test extends TestCase {

	
	@SuppressWarnings("static-access")
	public void pac() {
		
		inter pac= new inter("p","e","r","t","y","u","i","o");
		
		assertEquals(pac.language(),"p");
		assertEquals(pac.country(),"e");
		assertEquals(pac.getSring1(),"r");
		assertEquals(pac.getSring2(),"t");
		assertEquals(pac.getSring3(),"y");
		assertEquals(pac.getSring4(),"u");
		assertEquals(pac.getSring5(),"i");
		assertEquals(pac.getSring6(),"o");
		

	}
}