
/**
 * Write a description of class MidpointFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formulas {
    //mid
    public OrderedPairs findMidpoint (OrderedPairs A, OrderedPairs B){
        double x = (A.X() + B.X())/2;
        double y = (A.Y() + B.Y())/2;
        return new OrderedPairs (x, y);
    }
}
