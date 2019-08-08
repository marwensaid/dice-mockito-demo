package god;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayResultTest {
	
	PlayResult pr1;
	PlayResult pr2;
	
	@Before
	public void setUp() {
	  pr1 = new PlayResult(5);
	  pr2 = new PlayResult(2);
	}
	
	@Test 
	public void testCompareTo() {
		assertTrue(pr1.compareTo(pr2) > 0);
		assertTrue(pr2.compareTo(pr1) < 0);
		assertTrue(pr1.compareTo(pr1) == 0);
		assertTrue(pr1.compareTo(new PlayResult(5)) == 0);
	}
	
	@Test
	public void testEquals() {
		assertEquals(pr1,pr1);
		assertEquals(pr1,new PlayResult(5));
		assertNotEquals(pr1,pr2);		
	}

}
