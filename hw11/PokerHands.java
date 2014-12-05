//Mackenzie Burns
//December 4, 2014
//HW11 PokerHands.java

public class PokerHands{
    
public static void main(String [] arg){
    System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
    System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
    System.out.println("You did not enter a valid response");
    
    int [] numbers = new int[52];
    
    int z=0;
    for(int a=0; a<numbers.length; a++){
        numbers[a]=z;
    }
    int suit = z/13;
    int rank = z%13;
    
    int [] frequency = new int[13]; //new array of 13 to count the frequency of ranks
    int [] counter = new int[5]; //new array to count the frequency of 0s, 1s, 2s, etc. in the array
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