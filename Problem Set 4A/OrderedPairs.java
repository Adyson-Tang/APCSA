
/**
 * Write a description of class OrderedPairs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderedPairs {
    double x;
    double y;
    OrderedPairs () {
        x = 1;
        y = 2;
    }
    OrderedPairs (double X, double Y) {
        x = X;
        y = Y;
    }
    
    public String toString() {
        String Open = "(";
        String Close = ")";
        String Comma = ", ";
        return Open + x + Comma + y + Close;
    }
    
    public double X () {
        return x;
    }
    
    public double Y () {
        return y;
    }
}
