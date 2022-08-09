import java.util.Arrays;
import java.util.Scanner;

public class CalculatorGame {
    public static void main(String[] args) {
        Player newPlayer = createPlayer();
        while (newPlayer!= null) {
        Scanner quizSelector = new Scanner(System.in);
        System.out.println("Would you like to take the: \n A. Addition Quiz \n B. Modulo Quiz \n C. Subtraction Quiz \n D. True or False Quiz \n or EXIT");
        String userSelection = quizSelector.nextLine().toLowerCase();
            int[] highScore = new int[5];
            int count = 1;
            int myScore = 0;
            int myModScore = 0;
            int mySubScore = 0;
            int myTrueScore = 0;
            {
                if (userSelection.equals("a")) {
                    HighScores(highScore);
                    myScore = addQuiz(5);
                    highScore[count - 1] = myScore;
                    count++;
                    Boolean question = addQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1));
                    System.out.println(newPlayer.name() + " scored: " + myScore + " out of 5 on the Addition Quiz.");
                }
                if (userSelection.equals("b")) {
                    HighScores(highScore);
                    myModScore = moduloQuiz(5);
                    highScore[count - 1] = myModScore;
                    count++;
                    Boolean moduloQuestion = moduloQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1));
                    System.out.println(newPlayer.name() + " scored: " + myModScore + " out of 5 on the Modulo Quiz.");
                }
                if (userSelection.equals("c")) {
                    HighScores(highScore);
                    mySubScore = subtractionQuiz(5);
                    highScore[count - 1] = mySubScore;
                    count++;
                    Boolean subtractionQuestion = subtractionQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1));
                    System.out.println(newPlayer.name() + " scored: " + mySubScore + " out of 5 on the Subtraction Quiz.");
                }
                if (userSelection.equals("d")) {
                    HighScores(highScore);
                    myTrueScore = trueQuiz(5);
                    highScore[count - 1] = myTrueScore;
                    count++;
                    Boolean subtractionQuestion = trueQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1));
                    System.out.println(newPlayer.name() + " scored: " + myTrueScore + " out of 5 on the True or False Quiz.");
                }
            } if (userSelection.equals("exit")) {
                break;
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
            return true;
        }
        return false;
    }

    public static int subtractionQuiz(int length) {
        int myScore = 0;
        for (int i = 1; i < length; i++) {
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
            return true;
        }
        return false;
    }

    public static int trueQuiz(int length) {
        int myScore = 0;
            for (int i = 1; i < length; i++) {
                if (trueQuestion((int) (Math.floor(Math.random() * 100) + 1), (int) (Math.floor(Math.random() * 100) + 1))) {
                    myScore++;
                }
            }
            return myScore;
        }
    public static void HighScores(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("The score to beat is: " + max);
    }

    public static void displayArray(int[] arr){
        for(int num: arr){
            System.out.println(num);
        }
    }

}
record Player(String name, int age) {}
record HighScore(String player, int score) {}

