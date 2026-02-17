import java.util.Arrays;

public class Deck {

    int[] cards = new int[55];

    public Deck() {

        int val = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                cards[val] = i;
                val++;
            }
        }
    }

    public void shuffle() {

        for (int i = cards.length - 1; i >= 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            // fisher-yates algorithm; i got this off the internet
            int temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public void show() {
        System.out.println(Arrays.toString(cards));
    }

    public int giveCard() {

        int nextCard = cards[cards.length - 1];
        int[] newDeck = new int[cards.length - 1];

        for (int i = 0; i < cards.length - 1; i++) {
            newDeck[i] = cards[i];
        }

        cards = newDeck;
        return nextCard;
    }

}
