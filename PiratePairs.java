import java.util.Random;

public class PiratePairs {
      public static void main (String[] args) {

        int[] deck = new int[55];
        int val = 0;

        for(int i = 1; i <= 10; i++){
            for(int j = 0; j < i; j++){
                deck[val] = i;
                val++;
            }
        }

        public static Array shuffler(int[] deck) {

             Random rand = new Random();    

            for (int card : deck) {
                System.out.print(card + " ");
            } 

            for (int i = deck.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);

            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
            }

        }

        System.out.print("Shuffled: ");
        for (int card : deck) {
            System.out.print(card + " ");
        }

    }
}
