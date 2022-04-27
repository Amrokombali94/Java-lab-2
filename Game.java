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

    Random rand = new Random();
    int number = rand.nextInt(100);
    System.out.println(number);

    System.out.println(name+", I'm thinking of a number between 1 and 100\n" +
            "Try to guess my a number between 1 and 100.");
    Scanner s2 = new Scanner(System.in);


    int i = 0;
    int guess =-1;

      do {
         try {
             guess = s2.nextInt();
         } catch (Exception e){
             String badInput = s2.next();
             System.out.println("Looking for a whole number here, pal.");
             continue;
         }



      if( guess < number){
        System.out.println("Your guess? "+ guess);
        System.out.println("Your guess is too low, try again.");
        continue;
      } else if ( guess > number ) {
        System.out.println("Your guess? "+ guess);
        System.out.println("Your guess is too high, try again.");
        continue;
      } else if (guess == number){
        System.out.println("Your guess? "+ guess);
        System.out.println("Well done");
        break;
      };
     i++;
    }while(guess != number);

  }

}
