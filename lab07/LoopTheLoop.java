////////////////////////////////////////////////
//Mackenzie Burns
//October 9, 2014
//lab07 - LoopTheLoop.java

import java.util.Scanner;
//
//
public class LoopTheLoop {
        //main method required for every Java Program
        public static void main (String[] args) {
         
    
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    
    int nStars;
    nStars = 10;
    while (nStars>0) {
        String Stars = "*"; //initiating Stars
        //add a star each time
        
        System.out.println(Stars); //print out the stars
        Stars = "**";
        nStars--; //need to subtract one so that the loop can end
}
    
   
    while (nStars<10){
        String nstars1 = "";
        System.out.println(nstars1);
        nstars1 = "**";
        break;
    }
//add in another while statement and put on a new line, so that if stars=1, it will print out one line with 1 star
}
}