import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int answer = (int) Math.floor(Math.random()*50) + 1;
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please make a guess: ");
            int guess = myScanner.nextInt();
            if (answer == guess) {
                System.out.println("Woop woop! You're a winner!");
                break;
            } else {
                if (guess < answer) {
                    System.out.println("Guess higher!");
                } else {
                    System.out.println("Guess lower!");
                }
            }
        }
    }
}
