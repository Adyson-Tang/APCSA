
/**
 * Write a description of class FractionGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FractionGame {
    // instance variables - replace the example below with your own
    public static void main (String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        Fraction answer = new Fraction();
        Fraction first = new Fraction();
        Fraction second = new Fraction();
        Fraction winloss = new Fraction();
        int percent = 0;
        String answerString = "";
        int randomchar = (int) (Math.random() * 9) + 1;
        Fraction correctAnswer = new Fraction();
        char operation = '+';
        int correct = 0;
        int total = 0;
        System.out.println("Let the Fraction Quiz Begin! Answers should be in lowest terms. Good luck!");
        System.out.println("");
        while (!answerString.equals("quit")) {
            randomchar = (int) (Math.random() * 4) + 1;
            first = new Fraction ((int) (Math.random() * 9) + 1, (int) (Math.random() * 9) + 1);
            second = new Fraction ((int) (Math.random() * 9) + 1, (int) (Math.random() * 9) + 1);
            if (randomchar == 1) {
                operation = '+';
                correctAnswer = Fraction.add(first, second); 
            } else if (randomchar == 2) {
                operation = '-';
                correctAnswer = Fraction.subtract(first, second); 
            } else if (randomchar == 3) {
                operation = '*';
                correctAnswer = Fraction.multiply(first, second); 
            } else {
                operation = '/';
                correctAnswer = Fraction.divide(first, second); 
            }
            System.out.println(randomchar + "");
            System.out.println("why???");
            System.out.print(first + " " + operation + " " + second + " = ");
            answerString = input.nextLine();
            answer = new Fraction(answerString);
            if (answerString.equals("quit")) {
                System.out.println("");
                System.out.println("Your win/loss ratio was " + winloss + ", for a score of " + percent + " percent!");
                break;
            }
            //answer = new Fraction(answerString);
            if (answer.getNum() == correctAnswer.getNum() && answer.getDenom() == correctAnswer.getDenom()) {
                System.out.println("Correct!");
                correct++;
                total++;
            } else {
                System.out.println("Wrong, the answer was " + correctAnswer);
                total++;
            }
            winloss.setNum(correct);
            winloss.setDenom(total);
            percent = (int) Math.round(winloss.toDouble() * 100);
            System.out.println("");
        }
    }
}
