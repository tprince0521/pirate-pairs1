import java.util.Arrays;

public class Player {

    int[] hand = new int[10];
    int points = 0;

    public Player() {
    }

    public void takeCard(int drawn) {
        for (int i = 0; i < 10; i++) {
            if (hand[i] == 0) {
                hand[i] = drawn;
                break;
            } else {
            }
        }
    }

    public void showHand() {
        System.out.print(Arrays.toString(hand));
    }

    public int[] getHand() {
        return hand;
    }

    public void addPoints(int drawn) {
        points += drawn;
    }

    public int getPoints() {
        return points;
    }

    public void resetHand() {
        this.hand = new int[10];
    }

}