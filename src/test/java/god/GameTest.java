package god;

import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;

public class GameTest {

	Game game;
	
    @Test
    public void noWinnerAfter5Attempts() {
        Dice single = mock(Dice.class);
        when(single.roll()).thenReturn(1);

        Player player1 =  spy(new Player(single));
        Player player2 =  spy(new Player(single));

        this.game = new Game(player1,player2);
        assertFalse(this.game.play().isPresent());
        verify(player1, times(5)).play();
        verify(player2, times(5)).play();
    }


    @Test
    public void andTheWinnerIsP1() {

        Player player1 = mock(Player.class);
        when(player1.getLastValue()).thenReturn(Optional.of(new PlayResult(5)));

        Player player2 = mock(Player.class);
        when(player2.getLastValue()).thenReturn(Optional.of(new PlayResult(2)));

        this.game = new Game(player1,player2);
        assertEquals(player1, this.game.play().get());
    }
    
    @Test
    public void andTheWinnerIsP2() {

        Player player1 = mock(Player.class);
        when(player1.getLastValue()).thenReturn(Optional.of(new PlayResult(1)));

        Player player2 = mock(Player.class);
        when(player2.getLastValue()).thenReturn(Optional.of(new PlayResult(6)));

        this.game = new Game(player1,player2);
        assertEquals(player2, this.game.play().get());
    }
}
