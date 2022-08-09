import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner ageChecker = new Scanner(System.in);
        Integer userAge = 0;
        while (userAge >= 0) {
            System.out.println("Please enter your age:  or enter EXIT to leave.");
            userAge = ageChecker.nextInt();
            String exit = ageChecker.nextLine().toLowerCase();
                if (userAge > 17) {
                    System.out.println("You are old enough.");
                    // Multiple if's means your code would go and check all the if conditions, where as in case of elif, if one if condition satisfies it would not check other conditions..
                } else if (userAge == 17) {
                    System.out.println("You must be " + (18 - userAge) + " year older to enter.");
                } else if (userAge < 17) {
                    System.out.println("You must be " + (18 - userAge) + " years older to enter.");
                } else if (exit == "exit") {
                    break;
                }
            }
        }
    }
