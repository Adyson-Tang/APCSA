
/**
 * Write a description of class DriverDraw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverDrawCircle {
    public static void main(String[] args) {
        StdDraw.setScale (0, 500);
       //circles
       int d = 500;
       while (d > 0) {
           StdDraw.setPenRadius(0.01);
           StdDraw.circle (250, 250, d);
           d -=20;
       }
    }
}
