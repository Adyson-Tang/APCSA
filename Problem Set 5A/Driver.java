
public class Driver {
    public static void main (String[] args) {
        
        Fraction test1 = new Fraction ();
        Fraction test2 = new Fraction (1, 2);
        Fraction test3 = new Fraction ("1/2");
        Fraction test4 = new Fraction (test1);

        System.out.println("Constructor Testing:");
        
        System.out.println (test1);
        System.out.println (test2);
        System.out.println (test3);
        System.out.println (test4);

        System.out.println(" ");

        //testing accessor methods
        Fraction am = new Fraction (2, 6);
        
        System.out.println("Accessor Methods Testing:");
        
        
        System.out.println (am.getNum());
        System.out.println (am.getDenom());
        System.out.println (am.toString());
        System.out.println (am.toDouble());

        System.out.println(" ");
        
        //Fraction mm = new Fraction (2, 2);
        
        final Fraction half = new Fraction();
        final Fraction third = new Fraction ();
        
        System.out.println("Static Methods Testing: Multiply: ");
        Fraction product = Fraction.multiply(half, third);
        System.out.println(product);
        
        System.out.println("");
        
        System.out.println("Static Methods Testing: Divide: ");      
        Fraction quotient = Fraction.divide(half, third);
        System.out.println(quotient);
        
        System.out.println("");
     
        System.out.println("Static Methods Testing: Add: "); 
        Fraction sum = Fraction.add(half, third);
        System.out.println(sum);
        
        System.out.println("");
        
        System.out.println("Static Methods Testing: Subtract: ");
        Fraction diff = Fraction.subtract(half, third);
        System.out.println(diff);
    }
    
}
