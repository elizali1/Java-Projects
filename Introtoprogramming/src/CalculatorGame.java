import java.util.Arrays;
import java.util.Scanner;
public class CalculatorGame {
    public static void main(String[] args) {
        HighScore[] scoreList = new HighScore[5];
        Player player = createPlayer();
        int answer;
        do {
            int score = 0;
            Scanner quizSelector = new Scanner(System.in);
            System.out.println("Would you like to take the: \n A. Addition Quiz \n B. Modulo Quiz \n C. Subtraction Quiz \n D. True or False Quiz \n or EXIT");
            String userSelection = quizSelector.nextLine().toLowerCase();
            if (userSelection.equals("a")) {
                score = addQuiz(5);
                HighScore newScore = new HighScore(player, score);
                scoreList = addHighScore(newScore, scoreList);
                System.out.println(player.name() + " scored: " + score + " out of 5 on the Addition Quiz.");
                System.out.println(Arrays.toString(scoreList));
            }
            if (userSelection.equals("b")) {
                score = moduloQuiz(5);
                HighScore newScore = new HighScore(player, score);
                scoreList = addHighScore(newScore, scoreList);
                System.out.println(player.name() + " scored: " + score + " out of 5 on the Modulo Quiz.");
                System.out.println(Arrays.toString(scoreList));
            }
            if (userSelection.equals("c")) {
                score = subtractionQuiz(5);
                HighScore newScore = new HighScore(player, score);
                scoreList = addHighScore(newScore, scoreList);
                System.out.println(player.name() + " scored: " + score + " out of 5 on the Subtraction Quiz.");
                System.out.println(Arrays.toString(scoreList));

            }
            if (userSelection.equals("d")) {
                score = trueQuiz(5);
                HighScore newScore = new HighScore(player, score);
                scoreList = addHighScore(newScore, scoreList);
                System.out.println(player.name() + " scored: " + score + " out of 5 on the True or False Quiz.");
                System.out.println(Arrays.toString(scoreList));

            }
        } while(true);
    }
    static int index = 0;

    public static HighScore[] addHighScore(HighScore n, HighScore highScores[]){
        highScores[index] = n;
        index++;
        return highScores;
    }
    public static Player createPlayer () {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please provide your name: ");
        String name = myScanner.nextLine();
        System.out.println("Please provide your age: ");
        int age = myScanner.nextInt();
        Player newPlayer = new Player(name, age);
        return newPlayer;
    }

    public static boolean addQuestion (int a, int b){
        Scanner answer = new Scanner(System.in);
        System.out.println("Please add " + a + " and " + b + ": ");
        int userAnswer = answer.nextInt();
        if (userAnswer == a + b) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Wrong!");
        return false;
    }
    public static int addQuiz ( int length){
        int myScore = 0;
        for (int i = 0; i < length; i++) {
            if (addQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1)) == true) {
                myScore++;
            }
        }
        return myScore;
    }


    public static boolean moduloQuestion ( int a, int b){
        Scanner answer = new Scanner(System.in);
        System.out.println("Please find the remainder after dividing " + a + " and " + b + ": ");
        Integer userAnswer = answer.nextInt();
        if (userAnswer == a % b) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Wrong!");
        return false;
    }

    // below method is to keep score of modulo quiz
    public static int moduloQuiz ( int length){
        int myScore = 0;
        for (int i = 0; i < length; i++) {
            if (moduloQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1))) {
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
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Wrong!");
        return false;
    }

    public static int subtractionQuiz(int length) {
        int myScore = 0;
        for (int i = 0; i < length; i++) {
            if (subtractionQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1))) {
                myScore++;
            }
        }
        return myScore;
    }
    public static boolean trueQuestion(int a, int b) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Please answer true or false: " + a + " + " + b + " equals: " + (a + b));
        String userAnswer = answer.nextLine();
        if (userAnswer.equals("true")) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("Wrong!");
        return false;
    }

    public static int trueQuiz(int length) {
        int myScore = 0;
        for (int i = 0; i < length; i++) {
            if (trueQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1))) {
                myScore++;
            }
        }
        return myScore;
    }
}
record Player (String name, int age) { }
record HighScore (Player player, int score) { }
