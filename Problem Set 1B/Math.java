import java.util.Scanner;

public class Math{
    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);
        
        System.out.println ("*** Celsius to Fahrenheit ***");
        System.out.print ("Enter a temperature in Celsius");
        double CelciusInput = input.nextDouble();
        System.out.println (CelciusInput + " Celsius = " + ((CelciusInput * 9/5) + 32) + " Fahrenheit ");
        //remember how integers work

        System.out.println (" ");

        System.out.println ("*** BMI Calculator ***");
        System.out.print ("Enter a weight in kg ");
        int WeightInput = input.nextInt();
        System.out.print ("Enter a height in cm ");
        double HeightInput = input.nextDouble();
        System.out.println ("A " + HeightInput + "cm tall adult human who weighs " + WeightInput + "kg has a BMI of " + (WeightInput/(HeightInput*HeightInput)));

        System.out.println (" ");
        
        System.out.println ("*** Days to Weeks ***");
        System.out.print ("Enter a number of days: ");
        int DaysInput = input.nextInt();
        System.out.println (DaysInput + " days is equal to " + DaysInput/7 +  " weeks, and " + DaysInput%7 + " days");
        
        System.out.println ("");
        
        System.out.println ("*** Receipt Generator ***");
        System.out.print ("Enter the number of units you're buying: ");
        double UnitsInput = input.nextDouble();
        System.out.print ("Enter the price per unit: ");
        double PriceInput = input.nextDouble();
        System.out.print ("Enter the tax rate: ");
        double TaxInput = input.nextDouble();
        System.out.println ("Purchasing " + UnitsInput + " units at $" + PriceInput + " with " + TaxInput + "% tax will cost $" + (UnitsInput * PriceInput * (TaxInput/100 + 1)));  
        
        System.out.println (" ");
        
        System.out.println ("*** Sum of Digits ***");
        System.out.print ("Enter a positive, three-digit number: ");
        int Di = input.nextInt();
        System.out.print ("The sum of the digits of " + Di + " is " + (Di%10 + (((Di - Di%10)/10)%10) + Di/100));
        
        input.close();

    }
}