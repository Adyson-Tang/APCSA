
/**
 * Math things?
 *
 * Adysont Tang 1-3
 */
import java.util.Scanner;
public class Driver {
    public static void main (String [] args) {
        
        Scanner input = new Scanner (System.in);
        
        /*
        System.out.print ("Enter a x value: ");
        double x = input.nextDouble();
        System.out.print ("Enter a y value: ");
        double y = input.nextDouble();
        OrderedPairs Test = new OrderedPairs (x, y);
        System.out.println (Test);
        System.out.println ("x = " + Test.getX());
        System.out.println ("y = " + Test.getY());
        */
        
        //quad form
        System.out.println ("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print ("a: ");
        double a = input.nextDouble();
        
        System.out.print ("b: ");
        double b = input.nextDouble();
        
        System.out.print ("c: ");
        double c = input.nextDouble();
        
        Formulas quad = new Formulas ();
        
        System.out.println ("The solutions for" + a + "x^2 + " + b + "x + " + c + " are " + quad.findQuadraticRoots(a, b, c) + "."); 
        
        System.out.println (" ");
        
        //slope form
        System.out.println ("SLOPE FORMULA: Find the slope between points (x1, y1) aand (x2, y2)");
        System.out.print ("x1: ");
        double x1sf = input.nextDouble();
        System.out.print ("y1: ");
        double y1sf = input.nextDouble();
        
        OrderedPairs slopePoint1 = new OrderedPairs (x1sf, y1sf);
        
        System.out.print ("x2: ");
        double x2sf = input.nextDouble();
        System.out.print ("y2: ");
        double y2sf = input.nextDouble();
        
        OrderedPairs slopePoint2 = new OrderedPairs (x2sf, y2sf);
        
        Formulas slope = new Formulas();
        
        System.out.println ("A line between " + slopePoint1 + " and " + slopePoint2 + "has a slope of " + slope.findSlope(slopePoint1, slopePoint2));
        
        System.out.println (" ");
        
        //midpoint form
        System.out.println ("MIDPOINT FORMULA: Find the midpoint between (x1, y1) and (x2, y2)");
        System.out.print("x1: ");
        double x1mp = input.nextDouble();
        System.out.print ("y1: ");
        double y1mp = input.nextDouble();
        
        OrderedPairs midPoint1 = new OrderedPairs (x1mp, y1mp);
        
        System.out.print ("x2: ");
        double x2mp = input.nextDouble();
        System.out.print ("y2: ");
        double y2mp = input.nextDouble();
        
        OrderedPairs midPoint2 = new OrderedPairs (x2mp, y2mp);
        
        Formulas midPoint = new Formulas ();
        
        System.out.println ("The midpoint between " + midPoint1 + " and " + midPoint2 + " is " + midPoint.findMidpoint(midPoint1, midPoint2)); 
        
        System.out.println (" ");
        
        //sum of arithmetic series
        System.out.println ("SUM OF AN ARITHMETIC SERIES");
        System.out.print ("Number of terms: ");
        int kterms = input.nextInt();
        
        System.out.print ("Starts with: ");
        double aterms = input.nextDouble();
        
        System.out.print ("Increases by ");
        double dterms = input.nextDouble();
        
        Formulas arithSeries = new Formulas ();
        
        System.out.println ("The sum of the first " + kterms + " terms of an arithmetic series that starts with " + aterms + " and increases by " + dterms + " is " + arithSeries.findArithmeticSeriesSum(aterms, dterms, kterms));
        
        System.out.println (" ");
        
        //geo series
        System.out.println ("SUM OF A GEOMETRIC SERIES");
        System.out.print ("Number of terms: ");
        int kgterms = input.nextInt();
        
        System.out.print ("Starts with: ");
        double agterms = input.nextDouble();
        
        System.out.print ("Increases by ");
        double dgterms = input.nextDouble();
        
        Formulas geoSeries = new Formulas ();
        
        System.out.println ("The sum of the first " + kgterms + " terms of a finite geometric series that starts with " + agterms + " and increases by a rate of " + dgterms + " is " + geoSeries.findgeometricSeriesSum(agterms, dgterms, kgterms));
        
        System.out.println (" ");
        
        //die
        System.out.println ("DIE ROLLER");
        System.out.print ("How many sides does your die have? ");
        int sides = input.nextInt();
        
        Formulas die = new Formulas();
        
        System.out.println ("Rolling a " + sides + " -sided die... you got a " + die.rollDie(sides) + "!");
        
    }
}

