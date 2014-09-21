/////////////////////////////////////////////////////////////
//Mackenzie Burns
//September 21, 2014
//hw 04 Program #4
//TimePadding Java Program

import java.util.Scanner;
//
//
public class TimePadding {
    //main method required for every Java program
    public static void main(String [] args) {
        
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        int seconds, seconds2, minutes, minutes2, hours1, hours2, secondsr, hourss;
        System.out.print("Enter the time in seconds:");
        seconds = myScanner.nextInt();
        
        //finding the number of hours
        hours1 = ((seconds / 60)/60);
        hours2 = (int)hours1;
        
        //finding the number of seconds remaining
        hourss=((hours2*60)*60);
        secondsr = seconds-hourss;
        
        //finding the number of minutes
        minutes = secondsr/60;
        minutes2 = (int) minutes;
        
        //finding the number of seconds
        seconds2 = secondsr - (minutes2*60);
        
        if (minutes2 < 10 && seconds2 < 10) {
            System.out.println("The time is "+hours2+":0"+minutes2+":0"+seconds2+".");
        }
        else if (minutes2 < 10) {
            System.out.println("The time is "+hours2+":0"+minutes2+":"+seconds2+".");
        }
        else if (seconds2 < 10) {
            System.out.println("The time is "+hours2+":"+minutes2+":0"+seconds2+".");
        }
        else {
            System.out.println("The time is "+hours2+":"+minutes2+":"+seconds2+".");
        }
    }
}
