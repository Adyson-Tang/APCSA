
import java.util.Scanner;
import java.util.ArrayList;
public class Driver{
    public static void main (String [] args) {
        //TicTacToe test = new TicTacToe ();
        Scanner input = new Scanner (System.in);
        
        ArrayList <String> answer = new ArrayList <String> ();
        
        int p = 0;
        int i = 0;
        
        
        while (!(answer.equals("no") || answer.equals("No"))) {
            answer.add(input.nextLine());
            System.out.println(TicTacToe.grid(answer.get(i), p));
            if (TicTacToe.getRow(answer.get(i)) < 3 && TicTacToe.getRow(answer.get(i)) >= 0 && TicTacToe.getColumn(answer.get(i)) < 3 && TicTacToe.getColumn(answer.get(i)) >= 0) {
                    p++;
                    i++;
                }
            System.out.print(TicTacToe.player(p) + ", make your move (row,col):");
        }
    }
}
