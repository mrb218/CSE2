////////////////////////////////////////////////
//Mackenzie Burns
//BigMac Java Program
//September 10, 2014
//Calculating nBigMacs, cost, % tax and total cost
//
import java.util.Scanner;

//
public class BigMac {
            // main method required for every Java program
            public static void main(String [] args) {
                
    Scanner myScanner;
    myScanner = new Scanner ( System.in );
    
    System.out.print("Enter the number of BigMacs (an integer > 0): ");
    int nBigMacs= myScanner.nextInt ();
    
    System.out.print("Enter the cost per Big Mac as "+" a double:");
    double bigMac$= myScanner.nextDouble();
    
    System.out.print("Enter the percent tax as a whole number (xx):");
    double taxRate = myScanner.nextDouble();
    taxRate/=(100); //proportion of tax rate
    
    double cost$;
    int dollars, dimes, pennies; //storing digits
    cost$ = nBigMacs*bigMac$*(1+taxRate); //cost of bigmacs
    dollars=(int)cost$; //cost of bigmacs in dollars
    dimes=(int)(cost$*10) %10; //cost of bigmacs in dimes
    pennies=(int) (cost$*100) %10; //cost of bigmacs in pennies
    System.out.println("The total cost of Big Macs is "+nBigMacs+", at $"+bigMac$+" per bigMac, with a "+" sales tax of " + (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
    
    
                
            } 
} 