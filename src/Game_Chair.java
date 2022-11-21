import java.util.Scanner;

public class Game_Chair {


    public Game_Chair() {

    }

    public void newGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello to the BetMore_Game!");
        BetMore_Game bmg = new BetMore_Game();
        Shuffle s = new Shuffle();
        Player p1 = new Player(bmg, s);
        p1.start(); //Spiel wird gestartet und dem Computer Zahl zugewiesen
        System.out.println(p1.getCard());
        System.out.println("Spiel wurde gestartet und dem Computer eine zufällige Zahl zugewiesen!");
        System.out.println("Bitte geben sie ihren Namen ein Spieler 2!");
        String id = scanner.next();
        Player p2 = new Player(id, bmg, s);
        System.out.println("Willkommen im Spiel " + p2.getId() + "!");
        p2.start();
        System.out.println("Der Gewinner ist " + bmg.FindWinner(p1, p2).getId() + "!");
    }


}
