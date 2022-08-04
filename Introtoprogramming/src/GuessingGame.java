import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        int answer = generateRandomNumberUpTo(50);
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
    public static int generateRandomNumberUpTo(int range){
        return (int) Math.floor(Math.random()*range) + 1;
    }
}
