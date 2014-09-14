////////////////////////////////////////////////////////
//Mackenzie Burns
//September 13, 2014
//Hw03 Program #1
//
//  first compile a program
//      javac Bicyle.java
//  run the program
//      java Bicycle//
//
    import java.util.Scanner;
//
//define a class
public class Bicycle {
    // main method required for every Java Program
    public static void main(String[] args) {
//
    Scanner myScanner;
    myScanner = new Scanner ( System.in );
    
    System.out.print("Enter the number of seconds:");
    int nSecs = myScanner.nextInt ();
    
    System.out.print("Enter the number of counts:");
    int nCounts = myScanner.nextInt ();
    
    double wheelDiameter=27.0,   //Diameter of the wheel
    PI=3.14159,          //Pi
    feetPerMile=5280,    //distance in feet per mile
    inchesPerFoot=12,
    secondsPerMinute=60, //seconds per minute
    distance= ((nCounts*wheelDiameter*PI)/inchesPerFoot)/feetPerMile; //total distance for the trip
    double minutes, averageMPH, hours; 
    minutes = nSecs/60; //number of minutes
    hours = minutes/60; //number of seconds
    averageMPH= distance / hours; //average mph
    
    System.out.println("The distance was "+distance+" miles and it took "+minutes+" minutes");
    
    System.out.println("The average mph was "+averageMPH+" miles per hour");
    
   
    
    
    
        
    }
}