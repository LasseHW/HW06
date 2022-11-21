public class Shuffle {


    public Shuffle() {

    }

    public int pick_card() {
        int card = generateRandomNumber();

        return card;
    }

    public int generateRandomNumber() {
        double i = 1;
        i = (int) i * (Math.random() * 100);
        return (int) i;
    }
}
