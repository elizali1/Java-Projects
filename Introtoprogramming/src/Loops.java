import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int x = 20, sum = 0, i = 1;
//        while (i <= x) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("The sum of numbers from 1 to 20 is: "+sum+".");
        Scanner nInput = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = nInput.nextInt();
        int formula = n*(n+1)/2;
        int i = 1, sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("n = " +n);
        System.out.println("sum = "+sum);
        System.out.println("formula ="+formula);
        if (sum == formula) {
            System.out.println("Sum and Formula are equal!");
        }
    }
}
