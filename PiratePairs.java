public class PiratePairs {
    public static void main(String[] args) {
        Deck myDeck = new Deck();

        Player[] players = new Player[4];
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        players[0] = player1;
        players[1] = player2;
        players[2] = player3;
        players[3] = player4;

        int drawn;

        //myDeck.show();

        myDeck.shuffle();
        //myDeck.show();

        myDeck.giveCard();
        //myDeck.show();

        for (int i = 0; i < 4; i++){
            drawn = myDeck.giveCard();
            Player[] handToCheck = new Player[1];
            handToCheck[0] = players[i];

            for (Player card : handToCheck) {
                if (card == drawn) {
                    
               }
            }

            players[i].takeCard(drawn);
            players[i].showHand();
        }
        

    }
}
