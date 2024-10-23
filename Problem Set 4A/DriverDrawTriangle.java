
/**
 * Write a description of class DriverDraw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverDrawTriangle {
    public static void main(String[] args) {
        StdDraw.setScale (0, 1);
        OrderedPairs pointA = new OrderedPairs (Math.random() , Math.random());
        StdDraw.point (pointA.X(), pointA.Y());
        OrderedPairs pointB = new OrderedPairs (Math.random() , Math.random());
        StdDraw.point (pointB.X(), pointB.Y());
        OrderedPairs pointC = new OrderedPairs (Math.random() , Math.random());
        StdDraw.point (pointC.X(), pointC.Y());
        OrderedPairs ipoint = new OrderedPairs (Math.random() , Math.random());
        StdDraw.point (ipoint.X(), ipoint.Y());
        int test = 0;
        StdDraw.setPenRadius(0.001);
        
        while (test < 20000) {
            Formulas midpoint = new Formulas ();
            OrderedPairs chosenpoint = new OrderedPairs ();
            
            int randomize = (int) (Math.random () * 3) + 1;
            
            if (randomize == 1) {
                chosenpoint = pointA;
            }
            if (randomize == 2) {
                chosenpoint = pointB;
            }
            if (randomize == 3) {
                chosenpoint = pointC;
            }
            ipoint = midpoint.findMidpoint (ipoint, chosenpoint);
            StdDraw.point (ipoint.X(), ipoint.Y());
            test ++;
        }

    }
}

