package MyCard;

import java.util.Random;

public class MyCard {
    private int value;

    private Color color1;

    private Color color2;

    private Color color3;

    public int getValue() {
        shuffleCard();
        return value;
    }

    // getter
    public String getColor() {
        shuffleColor2();
        return getColor();
    }

    // setter
    public int setValue(int random) {
        this.value = random;
        return random;
    }

    public void shuffleCard() {
        Random random = new Random();
        setValue (random.nextInt(13)+1);
    }

    public MyCard() {
        shuffleColor2();
    }

    public void shuffleColor2() {
        Random random = new Random();
        color1 = (random.nextBoolean() ? Color.HJERTE : Color.KLØR);
        color2 = (random.nextBoolean() ? Color.SPAR : Color.RUDER);
        color3 = (random.nextBoolean() ? color1 : color2);
    }

    // getter
    public Color getValueColor1() {
        return color1;
    }

    // getter
    public Color getValueColor2() {
        return color2;
    }

    // getter
    public Color getValueColor3() {
        return color3;
    }
}