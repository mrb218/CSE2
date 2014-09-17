////////////////////////////////////////////////
//Mackenzie Burns
//September 14, 2013
//Hw03 Program #3 FourDigits.java
//
//  first compile a program
//      javac FourDigits.java
//  run the program
//      java FourDigits//
//
        import java.util.Scanner;

//define a class
    public class FourDigits {
            //main method required for every Java Program
            public static void main(String [] args) {
                
    Scanner myScanner;
    myScanner = new Scanner ( System.in );
    
    System.out.print("Enter a double, I display the four digits to the right of the decimal point:");
    double mydigits = myScanner.nextDouble ();
    
    int myint = (int) mydigits;
    int finaldigit = (int)(mydigits*10000); //the number multiplied by 10000 for no decimals
    int lastdigit4 = finaldigit%10; //get the one's digit, extracts it
    int seconddigit = (int)(finaldigit/10); //gets rid of the digit that was just extracted
    int lastdigit3 = seconddigit%10; //gets the new one's digit, extracts it
    int thirddigit = (int)(seconddigit/10); //gets rid of the digit that was just extracted
    int lastdigit2 = thirddigit%10; //gets the new one's digit, extracts it
    int fourthdigit = (int)(thirddigit/10); //gets rid of the digit that was just extracted
    int lastdigit1 = fourthdigit%10; //gets the new one's digit, extracts it


    int FourDigits = lastdigit1 + lastdigit2 +lastdigit3 + lastdigit4; //counts up the four digits that were extracted
    
   
    System.out.println("The first four digits to the right of the decimal are "+FourDigits+""); 
    

    
            }
    }