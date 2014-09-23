/////////////////////////////////////////////////////////////
//Mackenzie Burns
//September 20, 2014
//hw 04 Program #2
//Month Java Program

import java.util.Scanner;
//
public class Month {
    //main method required for every Java Program
    public static void main(String[] args) {
        
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        int year, monthnumber, LeapYear; //determining ints
        //asking you to put in a month
        System.out.print("Enter an int giving the number of the month (1-12)");
        monthnumber = myScanner.nextInt();
        
        //months with 31 days
        if (monthnumber == 1 || monthnumber == 3 || monthnumber == 5 || monthnumber == 7 || monthnumber == 8 || monthnumber == 10 || monthnumber == 12) {
            System.out.println("The month has 31 days.");
            //months with 30 days
        } else if (monthnumber == 4 || monthnumber == 6 || monthnumber == 9 || monthnumber == 11) {
            System.out.println("The month has 30 days.");
            //febuary has 28/29 days depending on the year
        } else if (monthnumber == 2) {
            System.out.print("Enter an int giving the year:");
                year = myScanner.nextInt();
                 //if it is a leap year, it has 29 days.
                if (year % 4 == 0) {
                    System.out.println("The month has 29 days.");
                    //if it is not a leap year, it has 28 days
                } else {
                    System.out.println("The month has 28 days.");
              
        }
                
        }
        
        else {
            System.out.println("You did not enter an int between 1 and 12.");
            return; //return back to asking to enter an int between 1-12 for a month
            
        }
        
    }
}