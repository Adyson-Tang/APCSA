import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int tries = 0;
        System.out.println("I'm thinking of a number between 1 and 100");
        while (guess != randomNumber) {
            System.out.print ("Your guess: ");
            guess = input.nextInt();
            if (guess > randomNumber) {
                System.out.println("Nope, that guess is too high.");
            } else System.out.println ("Nope, that guess is too low.");
            tries++;
        }
        System.out.println("You guessed it!!! :) + It took you " + tries + " tries.");
        
    }
}