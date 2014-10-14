////////////////////////////////////////////////
//Mackenzie Burns
//October 2014
//hw06 - Root.java

import java.util.Scanner;
//
//
public class Root {
        //main method required for every Java Program
        public static void main (String[] args) {
            
    Scanner myScanner;
    myScanner = new Scanner (System.in);
        System.out.print("Enter a double greater than zero:");
       double x = myScanner.nextInt(); //the number that the person inputs
    
    double low = .00;
    double high = 1.0 + x;
    double count = 1;
    double middle;
    
    
    while (high-low > (.0000001*(1+x))){ //if the high and low is smaller than the multiple of 1+x
         middle = (low + high)/2; //middle is the average
            if ((middle*middle) > x) { //the middle*middle has to be above x
                high = middle; //change the high to be the new middle
            }
            else { //if the middle*middle is less than x
                low = middle; //change the low to be the new middle
            }

      count++; //repeat
      
     if (high-low > (.0000001*(1+x))) {
            
            }
      else {
          System.out.println("The square root of your number is " +middle); //print out the square root
      } 
    }     

        }
}