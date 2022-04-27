/*

A number-guessing game.

*/

import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {

      System.out.println("Howdy, what's your name?");
      Scanner s1 = new Scanner(System.in);
      String name= s1.nextLine();

    int guess =-1;
    boolean isPlaying = false;
    do {


        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);

        System.out.println(name+", I'm thinking of a number between 1 and 100\n" +
                "Try to guess my a number between 1 and 100.");
        Scanner s2 = new Scanner(System.in);

        do {
            int i = 0;
            try {
                guess = s2.nextInt();
            } catch (Exception e) {
                String badInput = s2.next();
                System.out.println("Looking for a whole number here, pal.");
                continue;
            }


            if (guess < number) {
                System.out.println("Your guess? " + guess);
                System.out.println("Your guess is too low, try again.");
            } else if (guess > number) {
                System.out.println("Your guess? " + guess);
                System.out.println("Your guess is too high, try again.");
            } else {
                System.out.println("Your guess? " + guess);
                System.out.println("Well done");
                System.out.println("well done, " + name + "! You found my number in " + i + " tries!");
            }
            i++;
        } while (guess != number);
        System.out.println("Do you want to play true for 'yes' or false for 'no'?");
        Scanner s3 = new Scanner(System.in);
        isPlaying = s3.nextBoolean();
        System.out.println(isPlaying);
    }while (isPlaying) ;
  }

}
