/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner scan = new Scanner(System.in);
    
    double x= scan.nextDouble();
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   double y = 1-(x/100);
   double z = Math.round(y*100.0)/100.0;
   
   if(z==0.93) { //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
  }
    else if(z==0.59){//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
  }
    else if(z==0.86){//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
  }
    else if(z==0.67){//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
  }
    else if(z==0.4){//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
  }
    else{
      System.out.println("You did not enter one of the correct input numbers.");
      return;
    }
    
  }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *  Need to change the scanner so that the input can actually be used
 *  It only works for the numbers 7, 41, 14, 33, and 60 so it is not very reliable, it should have an else statement
 * the percent was not initialized- you should determine percent before the
 * if statement.
 * 
 * 
 */

