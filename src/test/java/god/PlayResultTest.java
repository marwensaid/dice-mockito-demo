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
		this.pr1 = new PlayResult(5);
		this.pr2 = new PlayResult(2);
	}
	
	@Test
	public void testCompareTo() {
		assertTrue(this.pr1.compareTo(this.pr2) > 0);
		assertTrue(this.pr2.compareTo(this.pr1) < 0);
		assertEquals(0, this.pr1.compareTo(this.pr1));
		assertEquals(0, this.pr1.compareTo(new PlayResult(5)));
	}
	
	@Test
	public void testEquals() {
		assertEquals(this.pr1, this.pr1);
		assertEquals(this.pr1,new PlayResult(5));
		assertNotEquals(this.pr1, this.pr2);
	}

}

