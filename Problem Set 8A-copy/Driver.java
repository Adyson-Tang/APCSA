
import java.util.Scanner;
import java.util.ArrayList;
public class Driver{
    public static void main (String [] args) {
        //TicTacToe test = new TicTacToe ();
        Scanner input = new Scanner (System.in);
        
        ArrayList <String> answer = new ArrayList <String> ();
        
        int p = 0;
        int i = 0;
        String yn = "";
        
        System.out.println("");
        System.out.println(TicTacToe.emptyGrid());
        System.out.println(TicTacToe.player(p) + ", make your move (row,col):");
        
        ArrayList <Integer> row = new ArrayList();
        ArrayList <Integer> column = new ArrayList();
        ArrayList <String> player = new ArrayList();
        
        int a = p;
        while (!(answer.equals("no") || answer.equals("No"))) {
            answer.add(input.nextLine());
            a = p-1;
            if (TicTacToe.getRow(answer.get(i)) < 3 && TicTacToe.getRow(answer.get(i)) >= 0 && TicTacToe.getColumn(answer.get(i)) < 3 && TicTacToe.getColumn(answer.get(i)) >= 0) {
                row.add(p,TicTacToe.getRow(answer.get(i)));
                column.add(p,TicTacToe.getColumn(answer.get(i)));
                player.add(p, TicTacToe.player(p));
                p++;
            }
            while (a >= 0) {
                    if (TicTacToe.getRow(answer.get(i)) == row.get(a) && TicTacToe.getColumn(answer.get(i)) == column.get(a)) {
                        row.remove(p-1);
                        column.remove(p-1);
                        player.add(p, TicTacToe.player(p -1));
                        p--;
                        System.out.println("That spot has been taken, please try again");
                    }
                    a--;
                }
            System.out.println("Round " + p);
            //System.out.println(TicTacToe.grid(p, row, column, player));
            if (!TicTacToe.grid(p,row,column,player).equals("")) {
                System.out.println("Player" + TicTacToe.player(p-1) + " WINS!");
                while (p > 0) {
                    row.remove(p - 1);
                    column.remove(p - 1);
                    player.remove(p - 1);
                    p--;
                }
                p = 0;
                System.out.println("Would you like to play again?");
                yn = input.nextLine();
                
                while (!yn.equals("Yes") && !yn.equals("yes") && !yn.equals("No") && !yn.equals("no")) {
                    System.out.println("Would you like to play again?");
                    if (yn.equals("No") || yn.equals("no")) {
                      break;  
                    }
                } 
            }else {
                System.out.print(TicTacToe.player(p) + ", make your move (row,col):");                  
            }
            if (yn.equals("No") || yn.equals("no")) {
                      break;  
                    }
            if (yn.equals("Yes") || yn.equals("yes")) {
                        System.out.println("");
                        System.out.println(TicTacToe.emptyGrid());
                        System.out.println(TicTacToe.player(p) + ", make your move (row,col):");
                    }
            i++;
        }
    }
}
