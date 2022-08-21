import java.util.Scanner;

/*
Assignment 3.6
Prompt:
*3.6 (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches.

For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.

Here is a sample run:

Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
BMI is 20.087702275404553
Normal
*/

class Main {
  public static void main(String arg[]) {
    // Create a float for metric or imperical units for measure
    double feet, inches, height, pounds;
    double meters, kg;

    // create bmi float
    double bmi;

    Scanner sc = new Scanner(System.in);
    System.out.println("Choose units of conversion: \n 1.Imperical BMI(ft/in & lbs) \n 2.Metric BMI(m/kg) ");
    int ch = sc.nextInt();

    switch (ch) {
      case 1:
        System.out.println("Enter weight in pounds:");
        pounds = sc.nextDouble();
        System.out.println("Enter feet:");
        feet = sc.nextDouble();
        System.out.println("Enter inches:");
        inches = sc.nextDouble();
        // 1. Convert height to inches
        height = (feet * 12) + inches;
        // 2. Calculate BMI Imperical
        bmi = (pounds * 703) / (height * height);
        System.out.println("Metric BMI is = " + bmi);
        // 3. Determine BMI Range for Imperical
        if (bmi < 89) {
          System.out.println("Underweight");
        } else if (89 <= bmi && bmi < 115) {
          System.out.println("Normal");
        } else if (115 <= bmi && bmi < 138) {
          System.out.println("Overweight");
        } else if (138 <= bmi && bmi < 185) {
          System.out.println("Obese");
        } else if (185 <= bmi) {
          System.out.println("Extreme Obese");
        } else {
          System.out.println("BMI error");
        }
        // Can this be done with a switch statement?
        // switch(bmi){
        // case (bmi<89):
        // System.out.println("Underweight");
        // case (89<=bmi<115):
        // System.out.println("Normal");
        // case (115<=bmi<138):
        // System.out.println("Overweight");
        // case (138<=bmi<185):
        // System.out.println("Obese");
        // case (185<=bmi):
        // System.out.println("Extreme Obese");
        // default:
        // System.out.println("BMI error");
        // }
        break;

      case 2:
        System.out.println("Enter weight in kilograms:");
        kg = sc.nextDouble();
        System.out.println("Enter height in meters:");
        meters = sc.nextDouble();
        // BMI is just weight / height^2 in metric
        bmi = (kg) / (meters * meters);
        System.out.println("Imperical BMI is = " + bmi);
        // 3. Determine BMI Range for Metric
        if (bmi < 40.2) {
          System.out.println("Underweight");
        } else if (40.2 <= bmi && bmi < 52) {
          System.out.println("Normal");
        } else if (52 <= bmi && bmi < 63.6) {
          System.out.println("Overweight");
        } else if (63.6 <= bmi && bmi < 84.1) {
          System.out.println("Obese");
        } else if (84.1 <= bmi) {
          System.out.println("Extreme Obese");
        } else {
          System.out.println("BMI error");
        }
        break;

      default:
        System.out.println("please choose valid choice");
    }
  }
}