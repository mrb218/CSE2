//////////////////////////////////////
//Mackenzie Burns
//Lab 02
//Cyclometer Java Program
//
//  first compile a program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer//

// define a class
public class Cyclometer {
    // main method required for every Java Program
    public static void main(String[] args)  {
    
    int secsTrip1=480; // seconds per Trip1
    int secsTrip2=3220; // seconds per Trip2
    int countsTrip1=1561; // Number of counts for Trip1
    int countsTrip2=9037; // Number of counts for Trip2
    double wheelDiameter=27.0, // constant 4 wheel diameter
    PI=3.14159, // 
    feetPerMile=5280, // Distance in feet per mile
    inchesPerFoot=12, // Distance in inches per mile
    secondsPerMinute=60; // Time in seconds
    double distanceTrip1, distanceTrip2, totalDistance; //
    System.out.println("Trip 1 took" + (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts.");
    System.out.println("Trip 2 took" + (secsTrip2/secondsPerMinute)+" minutes and had "+ countsTrip2+" counts.");
    
//run the calculations; store the values. Document your
//calculation here. What are you calculating?
//
//
distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
// (for each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

            //Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
      
      }   //end of main method
} //end of class