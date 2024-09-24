

public class Cylinder {
    double height;
    Circle base = new Circle ();
    
    Cylinder () {
        //default constructor
        height = 1;
        base = new Circle(1);
    }
    Cylinder (double r, double h) {
        height = h;
        base = new Circle(r);
        
    }
    //behavior methods
    public String toString () {
        return "Hello, I am a cylinder with a radius of " + base.getRadius() + " and a height of " + height;
    }
    public double getRadius () {
        return base.getRadius(); //remember brackets otherwise null?
    }
    public double getHeight () {
        return height;
    }
    public double surfaceArea () {
        return height * base.circumference() + (2 * base.area()); 
    }
    public double volume (){
        return base.area() * height;
    }
}
