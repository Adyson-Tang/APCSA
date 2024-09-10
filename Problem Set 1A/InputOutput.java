import java.util.Scanner;

public class InputOutput {
    public static void main (String [] args) {
      Scanner input = new Scanner (System.in);
      System.out.print ("Whats your name? ");
      String name = input.nextLine();
      
      System.out.print ("What is your favorite show? ");
      String show = input.nextLine(); 
      
      System.out.print ("How hours do you spend studying every day? ");
      int studyTime = input.nextInt();
      
      System.out.print ("How many hours do you spend watching shows? ");
      int watchTime = input.nextInt ();
      
      System.out.println ("");
      System.out.println ("Summary:");
      System.out.println ("Hi " + name + ",");
      System.out.println ("Your favorite show is " + show);
      if (watchTime > 2) {
          System.out.println ("You study too much :(");
      }
      if (watchTime + studyTime > 20) {
          System.out.println ("When do you sleep?!");
      }
      System.out.println ("You spend " + (watchTime + studyTime) + " watching shows or studying");
      
      
      input.close();
      
      
    }
}