public class BetMore_Game {
    private final Shuffle s = new Shuffle();

    public BetMore_Game() {

    }

    public int play() {
        int card = 0;
        card = s.pick_card();

        return card;
    }

    public Player FindWinner(Player p1, Player p2) {
        if (p1.getCard() > p2.getCard()) {
            return p1;
        } else {
            return p2;
        }
    }
}
