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

        // myDeck.show();

        myDeck.shuffle();
        // myDeck.show();

        myDeck.giveCard();
        // myDeck.show();

        int playersOut = 0;

        while (playersOut < 3) {
            for (int i = 0; i < 4; i++) {

                // continue checks if the player is out then skips their turn
                if (players[i].getPoints() > 13) {
                    continue;
                }

                drawn = myDeck.giveCard();

                boolean match = false;

                for (int card : players[i].getHand()) {
                    if (card == drawn) {
                        match = true;
                        break;
                    }
                }

                if (match) {
                    players[i].addPoints(drawn);
                    players[i].resetHand();
                } else {
                    players[i].takeCard(drawn);
                }

                players[i].showHand();
                System.out.println(" player " + (i + 1) + " points: " + players[i].getPoints());
            }

            System.out.println(" ");
            System.out.println("------- NEXT ROUND -------");
            System.out.println(" ");

            playersOut = 0;

            for (int i = 0; i < 4; i++) {
                if (players[i].getPoints() > 13) {
                    System.out.println("Player " + (i + 1) + " IS OUT");
                    System.out.println(" ");

                    playersOut++;
                }
            }

        }
    }
}