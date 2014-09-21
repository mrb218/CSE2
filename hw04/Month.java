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
        
        int year, monthnumber, LeapYear;
        
        System.out.print("Enter an int giving the number of the month (1-12)");
        monthnumber = myScanner.nextInt();
        if (monthnumber == 1 || monthnumber == 3 || monthnumber == 5 || monthnumber == 7 || monthnumber == 8 || monthnumber == 10 || monthnumber == 12) {
            System.out.println("The month has 31 days.");
        } else if (monthnumber == 4 || monthnumber == 6 || monthnumber == 9 || monthnumber == 11) {
            System.out.println("The month has 30 days.");
        } else if (monthnumber == 2) {
            System.out.print("Enter an int giving the year:");
                year = myScanner.nextInt();
                 
                if (year == 1980 || year == 1984 || year == 1988 || year == 1992 || year == 1996 || year == 2000 || year == 2004 || year == 2008 || year == 2012) {
                    System.out.println("The month has 29 days.");
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