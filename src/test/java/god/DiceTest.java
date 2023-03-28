
package god;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
