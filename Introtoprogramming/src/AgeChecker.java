import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner ageChecker = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        Integer userAge = ageChecker.nextInt();
        if (userAge > 17) {System.out.println("You are old enough.");

    } else if (userAge == 17){
            System.out.println("You must be "+(18-userAge)+" year older to enter.");
        } else {
            System.out.println("You must be "+(18-userAge)+" years older to enter.");
        }
}}
