import java.util.Scanner;

public class CalculatorGame {
    static int a = (int) (Math.floor(Math.random() * 100) + 1);
    static int b = (int) (Math.floor(Math.random() * 100) + 1);
    public static void main(String[] args) {
        Player newPlayer = createPlayer();
        Scanner quizSelector = new Scanner(System.in);
        System.out.println("Would you like to take the Addition Quiz or the Modulo Quiz?");
        String userSelection = quizSelector.nextLine().toLowerCase();
        {
            if (userSelection.equals("addition")) {
                int myScore = addQuiz(5);
                Boolean question = addQuestion(a, b);
                System.out.println(newPlayer.name() + " scored: " + myScore + " out of 5 on the Addition Quiz.");
            }
            if (userSelection.equals("modulo")) {
                int myModScore = moduloQuiz(5);
                Boolean moduloQuestion = moduloQuestion(a, b);
                System.out.println(newPlayer.name() + " scored: " + myModScore + " out of 5 on the Modulo Quiz.");
            }
        }
    }

    public static Player createPlayer() {
        Scanner newPlayer = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String newPlayerName = newPlayer.nextLine();
        System.out.println("Please enter your age: ");
        Integer newPlayerAge = newPlayer.nextInt();
        return new Player(newPlayerName, newPlayerAge);
    }

    public static boolean addQuestion(int a, int b) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Please add " + a + " and " + b + ": ");
        Integer userAnswer = answer.nextInt();
        if (userAnswer == a + b) {
            return true;
        } return false;
    }

    public static int addQuiz(int length) {
        int myScore = 0;
        for (int i = 1; i < length; i++) {
            if (addQuestion(a,b)==true)
            {
                myScore++;
            }
        }
        return myScore;
    }
    public static boolean moduloQuestion(int a, int b) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Please find the remainder after dividing " + a + " and " + b + ": ");
        Integer userAnswer = answer.nextInt();
        if (userAnswer == a % b) {
            return true;
        } return false;
    }
    public static int moduloQuiz(int length) {
        int myScore = 0;
        for (int i = 1; i < length; i++) {
            if (moduloQuestion(a,b)==true)
            {
                myScore++;
            }
        }
        return myScore;
    }
}
record Player(String name, Integer age) {}
record HighScore(String player, int score) {}

