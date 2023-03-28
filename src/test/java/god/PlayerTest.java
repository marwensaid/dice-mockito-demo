package god;

import org.junit.jupiter.api.Test;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class PlayerTest {

    Player player;
    
    @Test
    public void lastValueNotInitialized() {
        this.player = new Player(new Dice(new Random()));
        assertFalse(this.player.getLastValue().isPresent());
    }

    @Test
    public void lastValueInitialized() {
        this.player = new Player(new Dice(new Random()));
        this.player.play();
        assertTrue(this.player.getLastValue().isPresent());
    }

    @Test
    public void throwDiceOnlyTwice() {
        Dice dice = mock(Dice.class);
        this.player = new Player(dice);
        this.player.play();
        verify(dice, times(2)).roll();
    }
    
    @Test
    public void keepTheMaximum() {
        Dice dice = mock(Dice.class);
        this.player = new Player(dice);

        when(dice.roll()).thenReturn(2,5);
        this.player.play();
        assertEquals(this.player.getLastValue().get(), new PlayResult(5));
        
        when(dice.roll()).thenReturn(6).thenReturn(1);
        this.player.play();
        assertEquals(this.player.getLastValue().get(), new PlayResult(6));
        
    }
    
}