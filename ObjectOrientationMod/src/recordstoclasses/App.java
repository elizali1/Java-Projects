package src.recordstoclasses;

import src.recordstoclasses.Product;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double sum = 0.0;
        Product[] products = new Product[3];
        products[0] = new Product("Apple", 1.49, 1);
        products[1] = new Product("Banana", 1.69, 1);
        products[2] = new Product("Mango", 2.25, 1);
        int newQuantity = 0;
        Scanner userQuantity = new Scanner(System.in);
        System.out.println("How many apples would you like?");
        newQuantity = userQuantity.nextInt();
        products[0].setQuantity(newQuantity);
        System.out.println("How many bananas would you like?");
        newQuantity = userQuantity.nextInt();
        products[1].setQuantity(newQuantity);
        System.out.println("How many mangoes would you like?");
        newQuantity = userQuantity.nextInt();
        products[2].setQuantity(newQuantity);
//        products[2].displayPrice();
//        products[2].totalItemPrice();
        //prints out all info in the form of an array
//        System.out.println(Arrays.toString(products));
        //prints out each item and it's info line by line if array index is not empty
        boolean containNull = true;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                System.out.println("empty");
            } else {
//                System.out.println(products[i]);
                sum += products[i].totalItemPrice();
            }
//        } for (Product p : products) {
//            sum += p.totalItemPrice();
//            }
//        System.out.println((sum));
        }
        System.out.printf("\nThe total price for all items is: %.2f", sum);
    }
}

    //Create a new method in your App class that takes a reference to a Product and a desired value. The method should alter the price of an item such that its value matches the desired value passed to the method.
