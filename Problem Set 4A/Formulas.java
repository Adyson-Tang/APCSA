
/**
 * Write a description of class MidpointFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formulas {
    //mid
    public OrderedPairs findMidpoint (OrderedPairs A, OrderedPairs B){
        double x = (A.getX() + B.getX())/2;
        double y = (A.getY() + B.getY())/2;
        return new OrderedPairs (x, y);
    }
}
