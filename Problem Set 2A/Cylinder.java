

public class Cylinder {
    double height;
    Circle base = new Circle ();
    
    Cylinder () {
        //default constructor
        height = 1;
        Circle base = new Circle(1);
    }
    Cylinder (double r, double h) {
        Circle base = new Circle(r);
        height = h;
        
    }
    //behavior methods
    public String toString () {
        return base + " and a height of " + height;
    }
    public double getRadius () {
        return base.getRadius();
    }
    public double getHeight () {
        return height;
    }
    public double surfaceArea () {
        return height * base.circumference() + 2 * base.area(); 
    }
    public double volume (){
        return base.area() * height;
    }
}
