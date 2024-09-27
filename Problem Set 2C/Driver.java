
/**
 * Math things?
 *
 * Adysont Tang 1-3
 */
import java.util.Scanner;
public class Driver {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter a x value: ");
        double x = input.nextDouble();
        System.out.print ("Enter a y value: ");
        double y = input.nextDouble();
        OrderedPairs Test = new OrderedPairs (x, y);
        System.out.println (Test);
        System.out.println ("x = " + Test.getX());
        System.out.println ("y = " + Test.getY());

        //quad

        //slope form
        System.out.println ("SLOPE FORMULA: Find the slope between points (x1, y1) aand (x2, y2)");
        System.out.println ("x1: ");
        double x1sf = input.nextDouble();
        System.out.println ("y1: ");
        double y1sf = input.nextDouble();
        
        OrderedPairs slopePoint1 = new OrderedPairs (x1sf, y1sf);
        
        System.out.println ("x2: ");
        double x2sf = input.nextDouble();
        System.out.println ("y2: ");
        double y2sf = input.nextDouble();
        
        OrderedPairs slopePoint2 = new OrderedPairs (x2sf, y2sf);
        
        Formulas slope = new Formulas();
        
        System.out.println ("A line between " + slopePoint1 + " and " + slopePoint2 + "has a slope of " + slope.findSlope(slopePoint1, slopePoint2));
        
        //midpoint form
        System.out.println ("MIDPOINT FORMULA: Find the midpoint between (x1, y1) and (x2, y2)");
        System.out.println ("x1: ");
        double x1mp = input.nextDouble();
        System.out.println ("y1: ");
        double y1mp = input.nextDouble();
        
        OrderedPairs midPoint1 = new OrderedPairs (x1mp, y1mp);
        
        System.out.println ("x2: ");
        double x2mp = input.nextDouble();
        System.out.println ("y2: ");
        double y2mp = input.nextDouble();
        
        OrderedPairs midPoint2 = new OrderedPairs (x2mp, y2mp);
        
        Formulas midPoint = new Formulas ();
        
        System.out.println ("The midpoint between " + midPoint1 + " and " + midPoint2 + " is " + midPoint.findMidpoint(midPoint1, midPoint2)); 
        
        //sum of arithmetic series
        System.out.println ("SUM OF AN ARITHMETIC SERIES");
        System.out.println ("Number of terms: ");
        int kterms = input.nextInt();
        
        System.out.println ("Starts with: ");
        double aterms = input.nextDouble();
        
        System.out.println ("Increases by ");
        double dterms = input.nextDouble();
        
        Formulas arithSeries = new Formulas ();
        
        System.out.println ("The sum of the first " + kterms + " terms of an arithmetic series that starts with " + aterms + " and increases by " + dterms + " is " + arithSeries.findArithmeticSeriesSum(aterms, dterms, kterms));
        
    }
}

