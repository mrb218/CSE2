/////////////////////////////////////////////////////////////
//Mackenzie Burns
//September 20, 2014
//hw 04 Program #1
//IncomeTax Java Program

import java.util.Scanner;
//
//
public class IncomeTax {
    //main method required for every Java program
    public static void main(String [] args) {
        
        
        Scanner myScanner;
        myScanner = new Scanner (System.in);
        
        double taxint$, taxint2$, taxRate1, taxRate2, taxRate3, taxRate4; 
        
        taxRate1 = .05; //rate 1
        taxRate2 = .07; //rate 2
        taxRate3 = .12; //rate 3
        taxRate4 = .14; //rate 4
        
        System.out.print("Enter an int giving the number of thousands:"); //asking user to enter an integer
        taxint$ = myScanner.nextInt(); //
        taxint2$ = taxint$*1000; //putting the number in thousands
        if (taxint$ > 0 && taxint$ < 20) { //if the int is above 0 and below 20
            System.out.println("The tax rate on $"+taxint2$+" is 5%, and the tax is $"+taxint2$*taxRate1+".");
        
        } else if (taxint$ >= 20 && taxint$ < 40) { //if the int is between 20 and 40
                System.out.println("The tax rate on "+taxint2$+" is 7%, and the tax is "+taxint2$*taxRate2+".");
        
        } else if (taxint$ >= 40 && taxint$ < 78) { //if the int is between 40 and 78
                System.out.println("The tax rate on "+taxint2$+" is 12%, and the tax is "+taxint2$*taxRate3+".");
        
        } else if (taxint$ >= 78) { //if the int is above 78
                System.out.println("The tax rate on "+taxint2$+" is 14%, and the tax is "+taxint2$*taxRate4+".");
        
        }
        
        else {
            System.out.println("You did not enter a positive integer.");
            return; //return to the question about entering an integer
        }
        
        
        
    }
}