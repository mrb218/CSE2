////////////////////////////////////////////////
//Mackenzie Burns
//September 17, 2014
//hw05 - BurgerKing.java


import java.util.Scanner;
//
//
public class BoolaBoola {
        //main method required for every Java Program
        public static void main (String[] args) {
         
    
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    int random1, random2, random3, conclusion1;
    
    random1 = (int)(Math.random()*(2)); //random number for first output
    random2 = (int)(Math.random()*(2)); //random number for second output
    random3 = (int)(Math.random()*(2)); //random number for third output
    conclusion1 = (int)(Math.random()*((4)+1)); //random statement || or &&
    
    
    boolean one = true;
    boolean two = true;
    boolean three = false;
    String theinput="";
   
   
    
    switch(random1){
            case 0: 
                 one = true;
            break;
            case 1: 
                 one = false;
            break;
        }
    switch(random2){
            case 0: 
                two = true;
            break;
            case 1: 
                two = false;
            break;
        }
    switch(random3){
            case 0: 
                three = true;
            break;
            case 1: 
                three = false;
            break;
        }
        
    boolean b1 = one||two||three;
    boolean b2 = one||two&&three;
    boolean b3 = one&&two||three;
    boolean b4 = one&&two&&three;
    
    switch(conclusion1){
            case 1: 
                System.out.print("Does "+one+"||"+two+"||"+three+" have the value true (t/T) or false (f/F)");
                         theinput=myScanner.next();
                if (theinput.equals("t")|| theinput.equals("T") || theinput.equals("f") || theinput.equals("F")){
                        if (theinput.equals("t")||theinput.equals("T")&&b1==true) {       
                                System.out.println("Correct!");
                         }
                                else if (theinput.equals("f")|| theinput.equals("F")&&b1==false) {
                                        System.out.println("Correct!");
                                }
                                else {
                                        System.out.println("Sorry, false!");
                        }
                }
                else {
                System.out.println("You did not enter a letter t, T, F, or f");
                }
            break;
            case 2: 
                System.out.print("Does "+one+"||"+two+"&&"+three+" have the value true (t/T) or false (f/F)");
                         theinput=myScanner.next();  
                 if (theinput.equals("t")|| theinput.equals("T") || theinput.equals("f") || theinput.equals("F")){
                         if (theinput.equals("t")||theinput.equals("T")&&b2==true) {       
                                System.out.println("Correct!");
                         }
                                else if (theinput.equals("f")|| theinput.equals("F")&&b2==false) {
                                        System.out.println("Correct!");
                                }
                                else {
                                        System.out.println("Sorry, false!");
                        }
                 }
                else {
                System.out.println("You did not enter a letter t, T, F, or f");
                }
            break;
            case 3:
                System.out.print("Does "+one+"&&"+two+"||"+three+" have the value true (t/T) or false (f/F)");
                         theinput=myScanner.next();
                 if (theinput.equals("t")|| theinput.equals("T") || theinput.equals("f") || theinput.equals("F")){
                         if (theinput.equals("t")||theinput.equals("T")&&b3==true) {       
                                System.out.println("Correct!");
                         }
                                else if (theinput.equals("f")|| theinput.equals("F")&&b3==false) {
                                        System.out.println("Correct!");
                                }
                                else {
                                        System.out.println("Sorry, false!");
                        }
                 }
                else {
                System.out.println("You did not enter a letter t, T, F, or f");
                }
                
            break;
            case 4:
                System.out.print("Does "+one+"&&"+two+"&&"+three+" have the value true (t/T) or false (f/F)");
                        theinput=myScanner.next();
                if (theinput.equals("t")|| theinput.equals("T") || theinput.equals("f") || theinput.equals("F")){
                        if (theinput.equals("t")||theinput.equals("T")&&b4==true) {       
                                System.out.println("Correct!");
                         }
                                else if (theinput.equals("f")|| theinput.equals("F")&&b4==false) {
                                        System.out.println("Correct!");
                                }
                                else {
                                        System.out.println("Sorry, false!");
                        }
                }
                else {
                System.out.println("You did not enter a letter t, T, F, or f");
                }
            break;
    }
    
          
        
        }
}