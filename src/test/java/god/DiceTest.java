
package god;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.mockito.Mockito.mock;

public class DiceTest {

	Dice theDice;

	@Mock Random trickedRandom = mock(Random.class);

	@Test
	public void rollReturnsAValue() {
		//TODO: tester le rolling et le retour d'une valeur
	}

	@Test
	public void identifyBadValuesGreaterThanNumberOfFaces() {
		//TODO: identifier les mauvaises valeurs supérieures au nombre de faces
	}

	@Test
    public void identifyBadValuesLesserThanOne() {
		//TODO: identifier les mauvaises valeurs inférieur au nombre de faces
    }
	

}
