/*
Assignment 4.13
*4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant. Here is a sample run:

Enter a letter: B
B is a consonant

Enter a letter grade: a
a is a vowel

Enter a letter grade: #
# is an invalid input

*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a letter");
    String letter = sc.nextLine();
    System.out.println("letter " + letter + " is a");
    System.out.println(letterCheck(letter));
  }

  public static String letterCheck(String letter) {
    if (letter.indexOf("a") != -1 ||
        letter.indexOf("e") != -1 ||
        letter.indexOf("i") != -1 ||
        letter.indexOf("o") != -1 ||
        letter.indexOf("u") != -1 ||
        letter.indexOf("A") != -1 ||
        letter.indexOf("E") != -1 ||
        letter.indexOf("I") != -1 ||
        letter.indexOf("O") != -1 ||
        letter.indexOf("U") != -1) {
      String result = "vowel";
      return result;
    } else {
      String result = "consonant";
      return result;
    }
  }
}