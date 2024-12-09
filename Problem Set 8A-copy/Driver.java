
import java.util.Scanner;
import java.util.ArrayList;
public class Driver{
    public static void main (String [] args) {
        //TicTacToe test = new TicTacToe ();
        Scanner input = new Scanner (System.in);
        
        ArrayList <String> answer = new ArrayList <String> ();
        
        int p = 0;
        int i = 0;
        
        System.out.println("");
        System.out.println(TicTacToe.player(p) + ", make your move (row,col):");
        System.out.println(TicTacToe.emptyGrid());
        
        ArrayList <Integer> row = new ArrayList();
        
        
        while (!(answer.equals("no") || answer.equals("No"))) {
            answer.add(input.nextLine());
            System.out.println(TicTacToe.grid(answer.get(i), p));
            if (TicTacToe.getRow(answer.get(i), p) < 3 && TicTacToe.getRow(answer.get(i), p) >= 0 && TicTacToe.getColumn(answer.get(i), p) < 3 && TicTacToe.getColumn(answer.get(i), p) >= 0) {
                    p++;
                    i++;
                    row.add(TicTacToe.getRow(answer.get(i), p));
                }
                
            //if (
            System.out.print(TicTacToe.player(p) + ", make your move (row,col):");
        }
    }
}
