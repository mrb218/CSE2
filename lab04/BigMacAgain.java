////////////////////////////////////////////////
//Mackenzie Burns
//September 17, 2014
//lab04 - BigMacAgain.java

import java.util.Scanner;
//
//
public class BigMacAgain {
        //main method required for every Java Program
        public static void main (String[] args) {
         
    
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    int nBigMacs = 0;
    double costBM$, costF$, costT$, costBMT$; //cost per Big Macs and Fries as doubles
    costBM$ = 2.22; //cost of BigMacs
    costF$ = 2.15; //cost of Fries
    
    
   
    //boolean statement
    System.out.print("Enter the number of BigMacs:");
    if (myScanner.hasNextInt()) {
            nBigMacs= myScanner.nextInt(); 
            costBMT$ = costBM$*nBigMacs; //compute cost of big macs
            costT$= costBMT$+costF$; //total cost of meal
            System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+costBMT$+" dollars."); }
    else {
        System.out.println("You did not enter an int.");
        return; //return to the question about entering number of BigMacs
    }
    
    String fries = "";
    System.out.print("Do you want an order of fries? Y/y/N/n/"); //ask if they want fries
    String answer=myScanner.next();
    if (answer.equals( "Y" )||answer.equals( "y" )) //if they say yes
           {
               System.out.println("The cost of french fries is "+costF$+".");
           }
    else if(answer.equals ("N")||answer.equals( "n" )) //if they say no
        {   
            System.out.println("No fries will be ordered.");
        }
    else {
        System.out.println("You did not input a correct letter."); //error
        return; //return to the question asking if they want fries
    }
        //total cost of bigmacs
        System.out.println("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs*costBM$+"dollars.");
        //total cost of the meal
        System.out.println("The total cost of your meal is "+costT$+" dollars.");
            
        } //end of main method
} //end of class