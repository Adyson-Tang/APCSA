
/**
 * Write a description of class DriverDraw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverDrawCurve {
    public static void main(String[] args) {
        StdDraw.setScale (0, 500);

       //curve
       int a = 500;
       int b = 0;
       while (a > 0) {
           StdDraw.line (a, 0, 500, a);
           StdDraw.line (0, b, b, 500);
           a -= 20;
           b += 20;
       }

    }
}
