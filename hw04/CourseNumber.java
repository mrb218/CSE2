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
        year = (coursenum / 100); //the year is the first four numbers
        int year2; //need to delete the decimals by changing it to an int
        year2 = ((int) year);
        term = (coursenum - (year2*100)); //the term is the entered number minus the year multiplied by 100
        
        //the number entered had to be between 186510 and 201440
        if (coursenum < 186510 || coursenum > 201440){
            System.out.println("The number was outside the range [186510, 201440]");
            //if the term is 10, it is in the spring
        } else if (term == 10) {
            System.out.println("The course was offered in the spring semester of "+year2+".");
            //if the term is 20, it is in the summer 1 term
        } else if (term == 20) {
            System.out.println("The course was offered in the Summer 1 semester of "+year2+".");
            //if the term is 30, it is in the summer 2 term
        } else if (term == 30) {
            System.out.println("The course was offered in the Summer 2 semester of "+year2+".");
            //if the term is 40, it is in the fall semester
        } else if (term == 40) {
            System.out.println("The course was offered in the fall semester of "+year2+".");
        }
      
        //if nothing obliges, it is not the right number entered.
        else {
            System.out.println(""+term+" is not a legitimate semester.");
        }
    }
}