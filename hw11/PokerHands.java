//Mackenzie Burns
//December 4, 2014
//HW11 PokerHands.java



import java.util.Scanner;
public class PokerHands{
    
public static void main(String [] arg){
    
    Scanner myScanner;
    myScanner = new Scanner(System.in);
    
    
    System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
    String suitInput=myScanner.next();
    
    System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
    String rankInput=myScanner.next();
    
    
    
    int [] numbers = new int[52];
    
    int z=0;
    for(int a=0; a<numbers.length; a++){
        numbers[a]=z;
    }
    
    
    int suit = z/13;
    int rank = z%13;
    
    int [] frequency = new int[13]; //new array of 13 to count the frequency of ranks
    int [] counter = new int[5]; //new array to count the frequency of 0s, 1s, 2s, etc. in the array
    
    int hand;
    
    System.out.println("Enter 'y' or 'Y' to enter a(nother) hand- ");
    String yesOrNo = myScanner.next();
    
    while(yesOrNo.equals("y") || yesOrNo.equals("Y"));{
        

    if (suitInput.equals("c")){ //if the person wants clubs
        if(rankInput.equals("a")){ //input is ace
            hand = 0; //initialize each input as a number for the hand
            frequency[rank] += 1;
        }
        else if(rankInput.equals("k")){ //kind
            hand = 1;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("q")){ //queen
            hand = 2;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("j")){ //jack
            hand = 3;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("10")){
            hand = 4;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("9")){
            hand = 5;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("8")){
            hand = 6;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("7")){
            hand = 7;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("6")){
            hand = 8;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("5")){
            hand = 9;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("4")){
            hand = 10;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("3")){
            hand = 11;
            frequency[rank] += 1;
        }
        else if(rankInput.equals("2")){
            hand = 12;
            frequency[rank] += 1;
        }
        else{
            System.out.println("You did not enter a valid response");
        }
        
    }
    else{
        System.out.println("You did not enter a valid response");
    }
    
    if (suitInput == "d"){ //if the person wants diamonds
        if(rankInput.equals("a")){ //input is ace
            hand = 0; //initialize each input as a number for the hand
        }
        else if(rankInput.equals("k")){ //kind
            hand = 1;
        }
        else if(rankInput.equals("q")){ //queen
            hand = 2;
        }
        else if(rankInput.equals("j")){ //jack
            hand = 3;
        }
        else if(rankInput.equals("10")){
            hand = 4;
        }
        else if(rankInput.equals("9")){
            hand = 5;
        }
        else if(rankInput.equals("8")){
            hand = 6;
        }
        else if(rankInput.equals("7")){
            hand = 7;
        }
        else if(rankInput.equals("6")){
            hand = 8;
        }
        else if(rankInput.equals("5")){
            hand = 9;
        }
        else if(rankInput.equals("4")){
            hand = 10;
        }
        else if(rankInput.equals("3")){
            hand = 11;
        }
        else if(rankInput.equals("2")){
            hand = 12;
        }
        else{
            System.out.println("You did not enter a valid response");
        }
        
    }
    else{
        System.out.println("You did not enter a valid response");
    }
    
    if (suitInput == "h"){ //if the person wants hearts
        if(rankInput.equals("a")){ //input is ace
            hand = 0; //initialize each input as a number for the hand
        }
        else if(rankInput.equals("k")){ //kind
            hand = 1;
        }
        else if(rankInput.equals("q")){ //queen
            hand = 2;
        }
        else if(rankInput.equals("j")){ //jack
            hand = 3;
        }
        else if(rankInput.equals("10")){
            hand = 4;
        }
        else if(rankInput.equals("9")){
            hand = 5;
        }
        else if(rankInput.equals("8")){
            hand = 6;
        }
        else if(rankInput.equals("7")){
            hand = 7;
        }
        else if(rankInput.equals("6")){
            hand = 8;
        }
        else if(rankInput.equals("5")){
            hand = 9;
        }
        else if(rankInput.equals("4")){
            hand = 10;
        }
        else if(rankInput.equals("3")){
            hand = 11;
        }
        else if(rankInput.equals("2")){
            hand = 12;
        }
        else{
            System.out.println("You did not enter a valid response");
        }
        
    }
    else{
        System.out.println("You did not enter a valid response");
    }
    
    if (suitInput == "s"){ //if the person wants spades
        if(rankInput.equals("a")){ //input is ace
            hand = 0; //initialize each input as a number for the hand
        }
        else if(rankInput.equals("k")){ //kind
            hand = 1;
        }
        else if(rankInput.equals("q")){ //queen
            hand = 2;
        }
        else if(rankInput.equals("j")){ //jack
            hand = 3;
        }
        else if(rankInput.equals("10")){
            hand = 4;
        }
        else if(rankInput.equals("9")){
            hand = 5;
        }
        else if(rankInput.equals("8")){
            hand = 6;
        }
        else if(rankInput.equals("7")){
            hand = 7;
        }
        else if(rankInput.equals("6")){
            hand = 8;
        }
        else if(rankInput.equals("5")){
            hand = 9;
        }
        else if(rankInput.equals("4")){
            hand = 10;
        }
        else if(rankInput.equals("3")){
            hand = 11;
        }
        else if(rankInput.equals("2")){
            hand = 12;
        }
        else{
            System.out.println("You did not enter a valid response");
        }
    }
    else{
        System.out.println("You did not enter a valid response");
    }
    
    frequency[rank] += 1;
//System.out.println("Enter 'y' or 'Y' to enter a(nother) hand- ");
  // yesOrNo = myScanner.next();

}//closes first while statement
System.out.println(+rank);

//instead of doing scan.next all the time

   
   
}

public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
}