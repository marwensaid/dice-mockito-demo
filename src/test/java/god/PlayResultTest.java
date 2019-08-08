package god;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayResultTest {
	
	PlayResult pr1;
	PlayResult pr2;
	
	@BeforeEach
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
