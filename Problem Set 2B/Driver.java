
/*
 Adyson Tang
 Sept 25
 2B
 */

import java.util.Scanner;

public class Driver {
    
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        StringTools sTools = new StringTools ();
        //Testing
        
        System.out.println ("lastLetter test case:");
        System.out.println ("Enter a word with at least one character:");
        String answer1 = input.nextLine();
        System.out.println ("The last letter is " + sTools.lastLetter(answer1));
        
        //test
        System.out.println (answer1.length());
        
        System.out.println (" ");
        
        System.out.println ("formatPhoneNumber test case:");
        System.out.println ("Enter a phone number:");
        String answer2 = input.nextLine();
        System.out.println (sTools.formatPhoneNumber(answer2));
        
        System.out.println (" ");
              
        System.out.println ("middleThree test case:");
        System.out.println ("Enter a word with an odd number of letters: ");
        String answer3 = input.nextLine();
        System.out.println ("The middle three letters are " + sTools.middleThree(answer3));
        
        System.out.println (" ");
        
        System.out.println ("swapLastTwo test case:");
        System.out.println ("Enter a word: ");
        String answer4 = input.nextLine();
        System.out.println ("When you swap the last two letters of this word you get: " + sTools.swapLastTwo(answer4));
        
        System.out.println (" ");
        
        System.out.println ("frontAgain test case:");
        System.out.println ("Enter a word: ");
        String answer5 = input.nextLine();
        System.out.println ("Enter a number: ");
        int answer6 = input.nextInt();
        System.out.println (sTools.frontAgain(answer5, answer6) + " (" + answer5 + ")");
        
    }
    
}

