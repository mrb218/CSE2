/////////////////////////////////////////////////////////
//Mackenzie Burns
//September 13,2014
//Hw03 Program #2 Root.java
//
//  first compile a program
//      javac Root.java
//  run the program
//      java Root//
//
        import java.util.Scanner;
//
//define a class
public class Root {
        // main method required for every Java Program
        public static void main(String[] args) {
//
    Scanner myScanner;
    myScanner = new Scanner ( System.in );
    
    System.out.print("Enter a double:");
    double x = myScanner.nextInt ();
    
    double guess1, guess2, guess3, guess4, guess5, guessF;
    guess1 = x/3;
    guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);
    guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
    guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
    guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
    guessF = (2*guess5*guess5*guess5+x)/(3*guess5*guess5);
    
    System.out.println("The cube root of the value is "+guessF+"");
    System.out.println("The value found cubed is "+guessF*guessF*guessF+"");
        }
}
