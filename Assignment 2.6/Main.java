import java.util.Scanner;

/*
Assignment 2.5/2.6
Prompt:
*2.5 (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total.

Here is a sample run:
Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5 

*/
class Main {
  public static void main(String arg[]) {
    double sub, percent;
    double total;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter subtotal");
    sub = sc.nextDouble();
    System.out.println("Please enter gratitude percentage");
    percent = sc.nextDouble();
    total = sub * (1 + (percent / 100));
    System.out.println("Total amount is = $" + total);

  }
}