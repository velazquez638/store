import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import store.books;

@SuppressWarnings("unused")
public class books_test {

	@SuppressWarnings("deprecation")
	
	public void test() {
		
		books test = new books ("paco","pepe","luis",23.4 ,13,true,false);
		assertEquals(test.getCategorie(),"paco");
		assertEquals(test.getStock(),"pepe");
		assertEquals(test.getCompra(),"luis");
		assertEquals(test.getUnits(), 23.4);
		assertEquals(test.getBook_name(),13);
		assertEquals(test.getWriter(),true);
		assertEquals(test.getCategorie(),false);
	
		fail("Not yet implemented");
		
		
	}

}