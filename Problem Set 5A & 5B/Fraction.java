
/**
 * Write a description of class Fraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fraction {
    //instance variables
    private int Numerator;
    private int Denominator;
    
    //Constructors
    public Fraction () {
        Numerator = 1;
        Denominator = 1;
    }
    public Fraction (int num, int den) {
        setNum(num);
        setDenom(den);
        reduce();
    }
    public Fraction (String frac) {
        if (frac.indexOf("/") <= 0) {
             System.out.println("Please enter a fraction in the correct formatting");
        } else {
            String n = frac.substring(0,frac.indexOf("/"));
            String d = frac.substring(frac.indexOf("/") + 1, frac.length());
            Numerator = Integer.parseInt(n);
            Denominator = Integer.parseInt(d);
            String Fraction = Numerator + "/" + Denominator;
        }
    }
    public Fraction (Fraction frac) {
        Numerator = frac.Numerator;
        Denominator = frac.Denominator;
    }
    
    //Accessor Methods
    public int getNum() {
        return Numerator;
    }
    public int getDenom() {
        return Denominator;
    }
    public String toString () {
        return Numerator + "/" + Denominator;
    }
    public double toDouble() {
        return (double) Numerator/Denominator;
    }
    
    //Mutator Methods
    public void setNum(int num) {
        Numerator = num;
    }
    public void setDenom (int den) {
        if (den == 0) {
            System.out.println("Error, denominator cannot be zero");
            den = 1;
        } else {
        Denominator = den;
        }
    }
    public void reduce() {
        int n = GCF();
        Numerator = Numerator/n;
        Denominator = Denominator/n;
    }
    
    //Helper Method?
    private int GCF () {
        int GCF = 1;
        int n = getNum();
        int d = getDenom();
        while (n > d || d > n) {
            if (n > d) {
                n = n - d;
            }
            if (d > n) {
                d = d - n;
            }
        }
        GCF = n;
        return GCF;
    }
    
    //Static Methods
    public static Fraction multiply (Fraction first, Fraction second) {
        Fraction product = new Fraction();
        product.setNum(first.getNum() * second.getNum());
        product.setDenom(first.getDenom() * second.getDenom());
        product.reduce();
        return product;
    }
    public static Fraction divide (Fraction first, Fraction second) {
        Fraction quotient = new Fraction();
        quotient.setNum(first.getNum() * second.getDenom());
        quotient.setDenom(first.getDenom() * second.getNum());
        quotient.reduce();
        return quotient;
    }
    public static Fraction add (Fraction first, Fraction second) {
        Fraction sum = new Fraction();
        sum.setDenom(first.getDenom() * second.getDenom());
        sum.setNum((first.getNum() * second.getDenom())+ (second.getNum() * first.getDenom()));
        sum.reduce();
        return sum;
    }
    public static Fraction subtract (Fraction first, Fraction second) {
        Fraction difference = new Fraction();
        difference.setDenom(first.getDenom() * second.getDenom());
        difference.setNum(first.getNum() * second.getDenom() - second.getNum() * first.getDenom());
        //difference.reduce();
        return difference; 
    }
}
