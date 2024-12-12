
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class TicTacToe  {
    public static String emptyGrid () {
        String [] [] grid = new String [3] [3];
        String GRID = "";
        for (int i  = 0; i < grid.length; i++) {
            for (int e = 0; e < grid[0].length; e++) { 
                grid [i] [e] = "[ ]";
                System.out.print(grid[i][e]);
            }
            System.out.println();
        }
        //System.out.println(GRID);
        return GRID;
        }
    public static String grid (int p, ArrayList <Integer> row, ArrayList <Integer> column, ArrayList <String> player) {
        String [] [] grid = new String [3] [3];
        String GRID = "";
        int a = row.size() -1 ;
        for (int i  = 0; i < grid.length; i++) {
            for (int e = 0; e < grid[0].length; e++) { 
                grid [i] [e] = "[ ]";
                while (a >= 0) {
                    grid [row.get(a)] [column.get(a)] = "[" + player.get(a) + "]";
                    a--;
                }
                a = row.size() - 1;
                System.out.print(grid[i][e]);
            }
            System.out.println();
        }
        System.out.println();
        if (!grid [0] [0].equals("[ ]") && grid [0] [0].equals(grid [0] [1]) && grid [0] [1].equals(grid [0] [2])) {
                    GRID += player(p-1) + "WIN";
                }
        if (!grid [1] [0].equals("[ ]") && grid [1] [0].equals(grid [1] [1]) && grid [1] [1].equals(grid [1] [2])) {
                    GRID += player(p-1) + "WIN";
                }
        if (!grid [2] [0].equals("[ ]") && grid [2] [0].equals(grid [2] [1]) && grid [2] [1].equals(grid [2] [2])) {
                    GRID += player(p-1) + "WIN";
                }
        if (!grid [0] [0].equals("[ ]") && grid [0] [0].equals(grid [1] [0]) && grid [1] [0].equals(grid [2] [0])) {
                    GRID += player(p-1) + "WIN";
                }
        if (!grid [0] [1].equals("[ ]") && grid [0] [1].equals(grid [1] [1]) && grid [1] [1].equals(grid [2] [1])) {
                    GRID += player(p-1) + "WIN";
                }
        if (!grid [0] [2].equals("[ ]") && grid [0] [2].equals(grid [1] [2]) && grid [1] [2].equals(grid [2] [2])) {
                    GRID += player(p-1) + "WIN";
                }
        if (!grid [0] [0].equals("[ ]") && grid [0] [0].equals(grid [1] [1]) && grid [1] [1].equals(grid [2] [2])) {
                    GRID += player(p-1) + "WIN";
                }
        if (!grid [2] [0].equals("[ ]") && grid [2] [0].equals(grid [1] [1]) && grid [1] [1].equals(grid [0] [2])) {
                    GRID += player(p-1) + "WIN";
                }
        //System.out.println(GRID);
        return GRID;
    }
    public static int getRow (String input) {
        int y;
        input = input.substring(0, 1);
        y = Integer.parseInt(input);
        if (!(y < 3 && y >= 0)) {
            System.out.println("Please enter a value within range");
        }
        return y;
    }
    public static int getColumn (String input) {
        int x;
        input = input.substring(2, 3);
        x = Integer.parseInt(input);
        if (!(x < 3 && x >= 0)) {
            System.out.println("Please enter a value within range");
        }
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
    public static boolean win (ArrayList <Integer> row, ArrayList <Integer> column) {
        for (int b = 0; b < 3; b++) {
                for (int c = 0; c < 3; c++) {
                   if (row.get(c) == 0) {
                                               
                   }
                }
            }
            return true;
    }
}