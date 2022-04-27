/*

A number-guessing game.

*/

import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    System.out.println("Howdy, what's your name?");
    Scanner s1 = new Scanner(System.in);
    String name= s1.nextLine();
    System.out.println(name+", I'm thinking of a number between 1 and 100\n" +
            "Try to guess my a number between 1 and 100");
  }
}
