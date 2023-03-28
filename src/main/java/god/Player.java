package god;
import java.util.Optional;

public class Player {


    private final Dice dice;
    private Optional<PlayResult> lastValue = Optional.empty();

    public Player(Dice dice) {

        this.dice = dice;
    }

    public void play() {
    	int a = this.dice.roll();
    	int b = this.dice.roll();
        this.lastValue = Optional.of(new PlayResult(Math.max(a, b)));
    }

    public Optional<PlayResult> getLastValue() {
        return this.lastValue;
    }

}

