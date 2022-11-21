import java.util.Scanner;

public class Player {
    public static final String COMPUTER_ID = "Computer";
    private int card;
    private final String id;

    private final BetMore_Game bmg;
    private final Shuffle s;

    public Player(String id, BetMore_Game bmg, Shuffle s) {
        this.id = id;
        this.bmg = bmg;
        this.s = s;

    }

    /**
     * Creates the Computer Player.
     */
    public Player(BetMore_Game bmg, Shuffle s) {
        this(COMPUTER_ID, bmg, s);

    }


    public int start() {
        boolean user_Selected = false;
        int i = 6;
        if (!this.COMPUTER_ID.equals(id)) {
            while (i > 0 && !user_Selected) {
                card = bmg.play();
                System.out.println("Ihre gezogene Karte ist " + card + "!");
                if (i == 1) {
                    System.out.println("Sie können nicht mehr ziehen! Ihre Versuche sind aufgebraucht!");
                } else {
                    System.out.println(" '1' für Karte behalten: '2' für neues Ziehen!");

                    System.out.println("Sie können noch " + (i - 1) + " mal ziehen!");
                    Scanner scanner = new Scanner(System.in);
                    int decision = scanner.nextInt();
                    user_Selected = (decision == 1);
                }
                i--;

            }

        } else {
            card = bmg.play();
        }
        return card;
    }

    public String getId() {
        return id;
    }

    public int getCard() {
        return card;
    }


}
