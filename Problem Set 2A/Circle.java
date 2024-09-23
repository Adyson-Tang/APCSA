/* Adyson Tang
 * 1-3
 * 
 */
public class Circle {
        double radius;
        //instance variables
        public Circle () {
            //default constructor
            radius = 1;
        }
        public Circle (double r) {
            radius = r;
        }
        
        //behavior methods
        public String toString () {
            return "Hello, I am a circle with a radius of " + radius;
        }
        public double getRadius () {
            return radius;
        }
        public double circumference () {
            return radius * 2 * 3.14159;
        }
        public double area () {
            return 3.14156 * radius * radius;
        }
    }
