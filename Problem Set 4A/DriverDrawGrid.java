
/**
 * Write a description of class DriverDraw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverDrawGrid {
    public static void main(String[] args) {
        StdDraw.setScale (0, 500);

        //graph
        int x = 0;
        int y = 0;
        while (x < 500) {
            StdDraw.line(x, 0, x, 500);
            x += 20;
            StdDraw.line(0, y, 500, y);
            y += 20;
        }
    }
}
