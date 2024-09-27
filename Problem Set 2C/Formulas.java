
/**
 * Write a description of class Formulas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formulas {
    /* public OrderedPairs findQuadraticRoots (double a, double b, double c) {
        x = -b 
        return new OrderedPairs
    }
    
    */
    
    //slope
    public double findSlope (OrderedPairs A, OrderedPairs B) {
        return (B.getY() - A.getY()) / (B.getX() - A.getX());
    }
    
    //mid
    public OrderedPairs findMidpoint (OrderedPairs A, OrderedPairs B){
        double x = (A.getX() + B.getX())/2;
        double y = (A.getY() + B.getY())/2;
        return new OrderedPairs (x, y);
    }
    
    //sum
    public double findArithmeticSeriesSum (double a, double d, int k){
        double x = k;
        //double x1 = 2*a;
        //double x2 = k/2;
        //return x2*(d * x + x1);
        return x/2 * (2*a + d *(x - 1));
    }
    //make a double
    
    //geo
    public double findgeometricSeriesSum (double a, double r, int k) {
        double x = Math.pow(r, k);
        return a*((1-x)/(1-r));
    }
    
}