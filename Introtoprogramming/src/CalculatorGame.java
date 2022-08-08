import java.util.Arrays;
import java.util.Scanner;

public class CalculatorGame {
    public static void main(String[] args) {
        Player newPlayer = createPlayer();
        Scanner quizSelector = new Scanner(System.in);
        System.out.println("Would you like to take the Addition Quiz, the Modulo Quiz, or the Subtraction Quiz?");
        String userSelection = quizSelector.nextLine().toLowerCase();
        int myScore = 0;
        int myModScore = 0;
        int mySubScore = 0;
        {
            if (userSelection.equals("addition")) {
                myScore = addQuiz(5);
                Boolean question = addQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1));
                System.out.println(newPlayer.name() + " scored: " + myScore + " out of 5 on the Addition Quiz.");
            }
            if (userSelection.equals("modulo")) {
                myModScore = moduloQuiz(5);
                Boolean moduloQuestion = moduloQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1));
                System.out.println(newPlayer.name() + " scored: " + myModScore + " out of 5 on the Modulo Quiz.");
            }
            if (userSelection.equals("subtraction")) {
                mySubScore = subtractionQuiz(5);
                Boolean subtractionQuestion = subtractionQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1));
                System.out.println(newPlayer.name() + " scored: " + mySubScore + " out of 5 on the Subtraction Quiz.");
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
        int userAnswer = answer.nextInt();
        if (userAnswer == a + b) {
            return true;
        }
        return false;
    }

    public static int addQuiz(int length) {
        int myScore = 0;
        for (int i = 1; i < length; i++) {
            if (addQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1)) == true) {
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
        }
        return false;
    }

    public static int moduloQuiz(int length) {
        int myScore = 0;
        for (int i = 1; i < length; i++) {
            if (moduloQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1)) == true) {
                myScore++;
            }
        }
        return myScore;
    }

    public static boolean subtractionQuestion(int a, int b) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Please find the difference after subtracting " + a + " and " + b + ": ");
        Integer userAnswer = answer.nextInt();
        if (userAnswer == a - b) {
            return true;
        }
        return false;
    }

    public static int subtractionQuiz(int length) {
        int myScore = 0;
        for (int i = 1; i < length; i++) {
            if (subtractionQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1)) == true) {
                myScore++;
            }
        }
        return myScore;
    }

    public static boolean trueQuestion(int a, int b) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Please answer true or false: " + a + " + " + b + " equals: " + (a + b));
        Integer userAnswer = answer.nextInt();
        if (userAnswer == a - b) {
            return true;
        }
        return false;
    }

    public static int trueQuiz(int length) {
        int myScore = 0;
        for (int i = 1; i < length; i++) {
            if (trueQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1)) == true) {
                myScore++;
            }
        }
        return myScore;
    }
}
record Player(String name, Integer age) {}
record HighScore(String player, int score) {}

