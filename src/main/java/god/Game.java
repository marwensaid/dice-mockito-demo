package god;

import java.util.Optional;

public class Game {

    private final Player left;
    private final Player right;

    public Game(Player left, Player right) {
        this.left = left;
        this.right = right;
    }

    public Optional<Player> play() {
        int counter = 0;
        while(counter < 5) {
            this.left.play();  PlayResult playResultLeft = this.left.getLastValue().get();
            this.right.play(); PlayResult playResultRight = this.right.getLastValue().get();

            int cmp = playResultLeft.compareTo(playResultRight);
            
            if(cmp > 0 )      { return Optional.of(this.left);  }
            else if (cmp < 0) { return Optional.of(this.right); }

            counter++;
        }
        return Optional.empty();
    }
    
}

