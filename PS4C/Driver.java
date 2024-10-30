
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver { 
    public static void main (String[] args) {
        //dont have to create new
       //double n = sentimentVal("hi");
       //String word = sentimentVal(0.5);
         System.out.println(Review.totalSentiment("SimpleReview.txt"));
         System.out.println(Review.starRating("SimpleReview.txt") + " stars");
         System.out.println(Review.fakeReview("SimpleReview.txt"));;
}
    // instance variables - replace the example below with your own
}
