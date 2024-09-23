public class Driver {
    
    public static void main (String[] args) {
        //instantiation??
        //an instance of the Circle class
        Circle c1 = new Circle ();
        Circle c2 = new Circle (3);
        
        System.out.println(c1);
        System.out.println("getRadius() --> " + c1.getRadius() + " units");
        System.out.println("circumference() --> " + c1.circumference() + " units");
        System.out.println("area() --> " + c1.area() + " units^2");
        
        System.out.println(c2);
        System.out.println("getRadius() --> " + c2.getRadius() + " units");
        System.out.println("circumference() --> " + c2.circumference() + " units");
        System.out.println("area() --> " + c2.area() + " units^2");
        
        Cylinder cy1 = new Cylinder ();
        System.out.println(cy1);
    }
}
