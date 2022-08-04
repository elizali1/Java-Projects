import java.util.Scanner;

public class Loops2 {
        public static void main(String[] args) {
            int n = sumTo(500);
        }
        public static int sumTo(int range) {
            int sum = 0;
            int i = 0;
            Scanner limit = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            Integer n = limit.nextInt();
            while (i <= n) {
                sum = sum + i;
                i++;
            }
            System.out.println("The sum of numbers from 1 to "+n+" is: " + sum + ".");

            return sum;
        }
}