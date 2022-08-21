import java.util.Scanner;

/*
Assignment 2.1
Prompt:
2.1 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:

fahrenheit = (9 / 5) * celsius + 32

Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

Here is a sample run:

Enter a degree in Celsius: 43
43 Celsius is 109.4 Fahrenheit
*/

class Main {
  public static void main(String arg[]) {

    double f, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose type of conversion: \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
    int ch = sc.nextInt();

    switch (ch) {
      case 1:
        System.out.println("Enter  Fahrenheit temperature");
        f = sc.nextDouble();
        c = (f - 32) * 5 / 9;
        System.out.println("Celsius temperature is = " + c); 
        break;

      case 2:
        System.out.println("Enter  Celsius temperature");
        c = sc.nextDouble();
        f = ((9 * c) / 5) + 32;
        System.out.println("Fahrenheit temperature is = " + f);
        break;

        // to prevent memory leak we should close the scanner with an additional case
        // sc.close();
      

      default:
        System.out.println("please choose valid choice");
    }
  }
}