/////////////////////////////////////////////////////////////
//Mackenzie Burns
//September 21, 2014
//hw 04 Program #3
//CourseNumber Java Program
//
import java.util.Scanner;

public class CourseNumber {
    //main method required for every Java Program
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        int year, term, coursenum;
        
        System.out.print("Enter a six digit number giving the course semester.");
        coursenum = myScanner.nextInt(); //
        year = (coursenum / 100);
        int year2;
        year2 = ((int) year);
        term = (coursenum - (year2*100));
        
        if (coursenum < 186510 || coursenum > 201440){
            System.out.println("The number was outside the range [186510, 201440]");
        } else if (term == 10) {
            System.out.println("The course was offered in the spring semester of "+year2+".");
        } else if (term == 20) {
            System.out.println("The course was offered in the Summer 1 semester of "+year2+".");
        } else if (term == 30) {
            System.out.println("The course was offered in the Summer 2 semester of "+year2+".");
        } else if (term == 40) {
            System.out.println("The course was offered in the fall semester of "+year2+".");
        }
      
        
        else {
            System.out.println(""+term+" is not a legitimate semester.");
        }
    }
}