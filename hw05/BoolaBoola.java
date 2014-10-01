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
    
    //determining the variables as booleans
    boolean one = true;
    boolean two = true;
    boolean three = false;
    String theinput="";
   
   
    //determining case one as true or false
    switch(random1){
            case 0: 
                 one = true;
            break;
            case 1: 
                 one = false;
            break;
        }
    //determining case two as true or false
    switch(random2){
            case 0: 
                two = true;
            break;
            case 1: 
                two = false;
            break;
        }
     //determining case three as true or false  
    switch(random3){
            case 0: 
                three = true;
            break;
            case 1: 
                three = false;
            break;
        }
        
        //determining the boolean statements, the 4 possibilities
    boolean b1 = one||two||three;
    boolean b2 = one||two&&three;
    boolean b3 = one&&two||three;
    boolean b4 = one&&two&&three;
    
    switch(conclusion1){
            case 1:  //asking user to input true or false with both or statements
                System.out.print("Does "+one+"||"+two+"||"+three+" have the value true (t/T) or false (f/F)");
                         theinput=myScanner.next();
                if (theinput.equals("t")|| theinput.equals("T") || theinput.equals("f") || theinput.equals("F")){ //input must be t, T, f, F
                        if (theinput.equals("t")||theinput.equals("T")&&b1==true) {     //if T/t equals the boolean statement1, then true
                                System.out.println("Correct!");
                         }
                                else if (theinput.equals("f")|| theinput.equals("F")&&b1==false) { //if they are all false, it is correct
                                        System.out.println("Correct!");
                                }
                                else { //if they aren't, then it is false
                                        System.out.println("Sorry, false!");
                        }
                }
                else {
                System.out.println("You did not enter a letter t, T, F, or f"); //need to enter one of these letters
                }
            break;
            case 2: //asking user to input true or false with one or statement and with one and statement
                System.out.print("Does "+one+"||"+two+"&&"+three+" have the value true (t/T) or false (f/F)");
                         theinput=myScanner.next();  
                 if (theinput.equals("t")|| theinput.equals("T") || theinput.equals("f") || theinput.equals("F")){ //input must be t, T, f, F
                         if (theinput.equals("t")||theinput.equals("T")&&b2==true) {     //if T/t equals the boolean statement1, then true  
                                System.out.println("Correct!");
                         }
                                else if (theinput.equals("f")|| theinput.equals("F")&&b2==false) { //if they are all false, it is correct
                                        System.out.println("Correct!");
                                }
                                else { //if they aren't, then it is false
                                        System.out.println("Sorry, false!");
                        }
                 }
                else {
                System.out.println("You did not enter a letter t, T, F, or f"); //user didnt order one of the letters
                }
            break;
            case 3: //asking user to input true or false with one or statement and with one and statement
                System.out.print("Does "+one+"&&"+two+"||"+three+" have the value true (t/T) or false (f/F)");
                         theinput=myScanner.next();
                 if (theinput.equals("t")|| theinput.equals("T") || theinput.equals("f") || theinput.equals("F")){ //input must be t, T, f, F
                         if (theinput.equals("t")||theinput.equals("T")&&b3==true) {      //if T/t equals the boolean statement1, then true 
                                System.out.println("Correct!");
                         }
                                else if (theinput.equals("f")|| theinput.equals("F")&&b3==false) { //if they are all false, it is correct
                                        System.out.println("Correct!");
                                }
                                else { //if they aren't, then it is false
                                        System.out.println("Sorry, false!");
                        }
                 }
                else {
                System.out.println("You did not enter a letter t, T, F, or f"); //user didnt order one of the letters
                }
                
            break;
            case 4: //asking user to input true or false with both and statements
                System.out.print("Does "+one+"&&"+two+"&&"+three+" have the value true (t/T) or false (f/F)");
                        theinput=myScanner.next();
                if (theinput.equals("t")|| theinput.equals("T") || theinput.equals("f") || theinput.equals("F")){ //input must be t, T, f, F
                        if (theinput.equals("t")||theinput.equals("T")&&b4==true) {       //if T/t equals the boolean statement1, then true
                                System.out.println("Correct!");
                         }
                                else if (theinput.equals("f")|| theinput.equals("F")&&b4==false) { //if they are all false, it is correct
                                        System.out.println("Correct!");
                                }
                                else { //if they aren't, then it is false
                                        System.out.println("Sorry, false!");
                        }
                }
                else {
                System.out.println("You did not enter a letter t, T, F, or f"); //user didnt order one of the letters
                }
            break;
    }
    
          
        
        }
}