
/**
 * Write a description of class Prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Prime
{
    // instance variables - replace the example below with your own
    public static ArrayList<Integer> bigPrime (int n) {
        ArrayList<Integer> Prime = new ArrayList();
        int i = 2;
        int p = 2;
        int e = 0;
        while (i < n) {
            Prime.add(i);
            i++;
        }
        i = 0;
        while (p < n && e < Prime.size()) {
            i = e;
            p = Prime.get(e);
            while (i < Prime.size()) {
                if (Prime.get(i)%p == 0 && Prime.get(i)/p != 1) {
                    Prime.remove(i);
                    i--;
                }
                i++;
            }
            e++;
        }
        return Prime;
    }
    
    public static String nums(int y) {
        int i = 0; 
        while (i < Prime.bigPrime(y).size()) {
           int x = y - Prime.bigPrime(y).get(i);
           for (int e = 0; e < bigPrime(y).size(); e++) {
               if (x == Prime.bigPrime(y).get(e)) {
                   return "" + x + " + " + Prime.bigPrime(y).get(i); 
               }
           }
           i++;
        }
        return "y";
    }
}
