package MyDie;

import java.util.Random;

public class MyDie {

    private int value;

    public int getValue() {
        rollDice();
        return value;
    }

    public int setValue(int random ) {
        this.value = random;
        return random;
    }

    public void rollDice() {
        Random random = new Random();
        setValue(random.nextInt(6)+1);
    }
}