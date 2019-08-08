
package god;

import org.junit.Test;
import java.util.Random;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DiceTest {

	Dice theDice;

	@Test
	public void rollReturnsAValue() {
		theDice = new Dice(new Random());
		for (int i = 0; i < 100; i++) {
			int result = theDice.roll();
			assertTrue(result >= 1);
			assertTrue(result <= 6);
		}
	}

	@Test(expected = RuntimeException.class)
	public void identifyBadValuesGreaterThanNumberOfFaces() {
		Random tooMuch = mock(Random.class);
		when(tooMuch.nextInt(anyInt())).thenReturn(7);
		theDice = new Dice(tooMuch);
		theDice.roll();
	}
	
    @Test(expected = RuntimeException.class)
    public void identifyBadValuesLesserThanOne() {
        Random notEnough = mock(Random.class);
        when(notEnough.nextInt(anyInt())).thenReturn(-1);
        theDice = new Dice(notEnough);
        theDice.roll();
    }
	

}
