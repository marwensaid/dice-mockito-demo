package god;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.Test;

public class GameTest {

	Game g;
	
    @Test
    public void noWinnerAfter5Attempts() {
        Dice single = mock(Dice.class);
        when(single.roll()).thenReturn(1);

        Player p1 =  spy(new Player("John", single));
        Player p2 =  spy(new Player("Jane", single));

        g = new Game(p1,p2);
        assertFalse(g.play().isPresent());
        verify(p1, times(5)).play();
        verify(p2, times(5)).play();
    }


    @Test
    public void andTheWinnerIsP1() {

        Player p1 = mock(Player.class);
        when(p1.getLastValue()).thenReturn(Optional.of(new PlayResult(5)));

        Player p2 = mock(Player.class);
        when(p2.getLastValue()).thenReturn(Optional.of(new PlayResult(2)));

        g = new Game(p1,p2);
        assertEquals(p1, g.play().get());
    }
    
    @Test
    public void andTheWinnerIsP2() {

        Player p1 = mock(Player.class);
        when(p1.getLastValue()).thenReturn(Optional.of(new PlayResult(1)));

        Player p2 = mock(Player.class);
        when(p2.getLastValue()).thenReturn(Optional.of(new PlayResult(6)));

        g = new Game(p1,p2);
        assertEquals(p2, g.play().get());
    }
}
