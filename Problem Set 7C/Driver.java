
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter a maximum number to find the Prime numbers until that max");
        int x = input.nextInt();
        System.out.println(x + " : " + Prime.bigPrime(x));
        
        
        System.out.println("Enter a number to find the Goldbach Conjecture");
        int xx = 1;
        while (xx % 2 != 0) {
            xx = input.nextInt();
            System.out.println("Please enter a multiple of 2");
        }
        
        System.out.println(xx + " = " + Prime.nums(xx));
    }
}
