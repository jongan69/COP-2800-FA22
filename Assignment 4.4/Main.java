
/*
Assignment 4.4
Prompt:
(Geometry: Area of a hexagon) The area of a hexagon can be computed using the following formula (s is the length of a side):


A = (6 * math.pow(s,2)) / 4 * Math.tan(Math.PI/6)

Write a program that prompts the user to enter the side of a hexagon and displays its area. Here is a sample run:

Enter the side: 5.5
The area of the hexagon is 78.59

*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the length of the hexagons sides");
    double sides = sc.nextDouble();
    System.out.println("Area of hexagon with " + sides + " sides");
    System.out.println(hexagonArea(sides));
  }

  public static double hexagonArea(double sides) {
    double Area = (6 * Math.pow(sides, 2)) / (4 * Math.tan(Math.PI / 6));
    return Area;
  }
}