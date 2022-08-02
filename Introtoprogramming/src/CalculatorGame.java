public class CalculatorGame {
    public static void main(String[] args) {
        Player me = new Player("Eliza", "24");
        System.out.println(me);
        HighScore myScore= new HighScore(me.name(), "100");
        System.out.println(myScore);
    }
}

record Player(String name, String number) {}
record HighScore(String player, String score) {}