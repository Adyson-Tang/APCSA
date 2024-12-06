
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class TicTacToe  {
    
    public static String grid (String move, int p) {
        String [] [] grid = new String [3] [3];
        String GRID = "";
        for (int i  = 0; i < grid.length; i++) {
            for (int e = 0; e < grid[0].length; e++) { 
                grid [i] [e] = "[ ]";
                if (getRow(move) < 3 && getRow(move) >= 0 && getColumn(move) < 3 && getColumn(move) >= 0) {
                    grid [getRow(move)] [getColumn(move)] = "[" + player(p) + "]";
                }
                System.out.print(grid[i][e]);
            }
            System.out.println();
        }
        //System.out.println(GRID);
        return GRID;
        }
    public static int getRow (String input) {
        int y;
        input = input.substring(0, 1);
        y = Integer.parseInt(input);
        return y;
    }
    public static int getColumn (String input) {
        int x;
        input = input.substring(2, 3);
        x = Integer.parseInt(input);
        return x;
    }
    public static String player(int p) {
        if (p%2 == 0) return "X";
        return "Y";
    }
    public static boolean saved (ArrayList<String> answer) {
        boolean [] [] saved = new boolean [3][3];
        for (int i  = 0; i < saved.length; i++) {
            for (int e = 0; e < saved[0].length; e++) { 
                saved [i] [e] = true;
            }
        }
        //if (answer.get(i)
        return true;
    }
}
    
    
