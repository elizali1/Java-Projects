import java.util.Scanner;

public class CalculatorGame {
    public static void main(String[] args) {
        Player newPlayer = createPlayer();
        System.out.println(newPlayer);
        HighScore myScore= new HighScore(newPlayer.name(), "100");
        System.out.println(myScore);
        Boolean question = addQuestion(2,2);
    }
    public static Player createPlayer(){
        Scanner newPlayer = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String newPlayerName = newPlayer.nextLine();
        System.out.println("Please enter your age: ");
        Integer newPlayerAge = newPlayer.nextInt();
        return new Player(newPlayerName, newPlayerAge);
    }
    public static boolean addQuestion(int a, int b){
        Scanner answer = new Scanner(System.in);
        System.out.println("Please add "+a+" and "+b+": ");
        Integer userAnswer = answer.nextInt();
        if (userAnswer == a+b){
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong!");
        }
        return true;
    }
//    public static int addQuiz(int length) {
//        while (true) {
//            int loop = 5;
//            if (addQuestion(2, 2) == true) ;
//            break;
//        }
//        return length;
//    }
}

record Player(String name, Integer age) {}
record HighScore(String player, String score) {}

