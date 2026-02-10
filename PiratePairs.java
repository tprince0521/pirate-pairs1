import java.util.Arrays;

public class PiratePairs {
      public static void main (String[] args) {

        int[] deck = new int[55];
        int val = 0;

        for(int i = 1; i <= 10; i++){
            for(int j = 0; j < i; j++){
                deck[val] = i;
                val ++;
            }
        }



    }
}
