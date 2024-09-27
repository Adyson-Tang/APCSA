
/**
 * 
 *
 *Adyson Tang
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
    
    public double getX () {
        return x;
    }
    
    public double getY () {
        return y;
    }
}
