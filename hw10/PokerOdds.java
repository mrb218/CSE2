/////////////////////////////////////
//Mackenzie Burns
//HW10 PokerOdds.java
//November 2014


import java.util.Random;
import java.util.Scanner;
    public class PokerOdds{
        public static void main(String [] arg){
            showHands();
            //simulateOdds();
        }
        
        public static void showHands(){
            
    
            
            /*
            int [] negative = new int[5];
            for(int y = 0; y<5; y++){
                negative[y] = -1;
            }
            
            int theDeck[] = new int[52];
            int theHand[] = new int[5];
            int random = (int)(Math.random()*((52-0)+1));
            int con = 0;
            int negativeone = -1;
            */
      
            
            String one = "Diamonds";
            String two = "Hearts";
            String three = "Clubs";
            String four = "Spades";
            
    for(int i=0; i<4; i++){ 
        
            int random1 = (int)(Math.random()*((4-0)+1));
            if(random1 == 1){ //determines suit Diamonds
            String names[] =  {"A of ", "K of ","Q of ","J of ","10 of ","9 of ","8 of ","7 of ","6 of ","5 of ","4 of ","3 of ","2 of "};
               int random2 = (int)(Math.random()*((14-0)+2));
                if(random2 == 2){
                    one = names[1] + one;
                }
                else if(random2 == 3){
                    one = names[2] + one;
                }
                else if(random2 == 4){
                    one = names[3] + one;
                }
                else if(random2 == 5){
                    one = names[4] + one;
                }
                else if(random2 == 6){
                    one = names[5] + one;
                }
                else if(random2 == 7){
                    one = names[6] + one;
                }
                else if(random2 == 8){
                    one = names[7] + one;
                }
                else if(random2 == 9){
                    one = names[8] + one;
                }
                else if(random2 == 10){
                    one = names[9] + one;
                }
                else if(random2 == 11){
                    one = names[10] + one;
                }
                else if(random2 == 12){
                    one = names[11] + one;
                }
                else if(random2 == 13){
                    one = names[12] + one;
                }
                else if(random2 == 14){
                    one = names[13] + one;
                }
                 System.out.println(one);
            }
            if(random1 == 2){ //determines suit Hearts
            String names[] =  {"A of ", "K of ","Q of ","J of ","10 of ","9 of ","8 of ","7 of ","6 of ","5 of ","4 of ","3 of ","2 of "};
                int random2 = (int)(Math.random()*((14-0)+2));
                if(random2 == 2){
                    two = names[1] + two;
                }
                else if(random2 == 3){
                    two = names[2] + two;
                }
                else if(random2 == 4){
                    two = names[3] + two;
                }
                else if(random2 == 5){
                    two = names[4] + two;
                }
                else if(random2 == 6){
                    two = names[5] + two;
                }
                else if(random2 == 7){
                    two = names[6] + two;
                }
                else if(random2 == 8){
                    two = names[7] + two;
                }
                else if(random2 == 9){
                    two = names[8] + two;
                }
                else if(random2 == 10){
                    two = names[9] + two;
                }
                else if(random2 == 11){
                    two = names[10] + two;
                }
                else if(random2 == 12){
                    two = names[11] + two;
                }
                else if(random2 == 13){
                    two = names[12] + two;
                }
                else if(random2 == 14){
                    two = names[13] + two;
                }
                 System.out.println(two);
            }
            if(random1 == 1){ //determines suit Clubs
            String names[] =  {"A of ", "K of ","Q of ","J of ","10 of ","9 of ","8 of ","7 of ","6 of ","5 of ","4 of ","3 of ","2 of "};
                int random2 = (int)(Math.random()*((14-0)+2));
                if(random2 == 2){
                    three = names[1] + three;
                }
                else if(random2 == 3){
                    three = names[2] + three;
                }
                else if(random2 == 4){
                    three = names[3] + three;
                }
                else if(random2 == 5){
                    three = names[4] + three;
                }
                else if(random2 == 6){
                    three = names[5] + three;
                }
                else if(random2 == 7){
                    three = names[6] + three;
                }
                else if(random2 == 8){
                    three = names[7] + three;
                }
                else if(random2 == 9){
                    three = names[8] + three;
                }
                else if(random2 == 10){
                    three = names[9] + three;
                }
                else if(random2 == 11){
                    three = names[10] + three;
                }
                else if(random2 == 12){
                    three = names[11] + three;
                }
                else if(random2 == 13){
                    three = names[12] + three;
                }
                else if(random2 == 14){
                    three = names[13] + three;
                }
                System.out.println(three);
            }
            if(random1 == 1){ //determines suit spades
            String names[] =  {"A of ", "K of ","Q of ","J of ","10 of ","9 of ","8 of ","7 of ","6 of ","5 of ","4 of ","3 of ","2 of "};
                int random2 = (int)(Math.random()*((14-0)+2));
                if(random2 == 2){
                    four = names[1] + four;
                }
                else if(random2 == 3){
                    four = names[2] + four;
                }
                else if(random2 == 4){
                    four = names[3] + four;
                }
                else if(random2 == 5){
                    four = names[4] + four;
                }
                else if(random2 == 6){
                    four = names[5] + four;
                }
                else if(random2 == 7){
                    four = names[6] + four;
                }
                else if(random2 == 8){
                    four = names[7] + four;
                }
                else if(random2 == 9){
                    four = names[8] + four;
                }
                else if(random2 == 10){
                    four = names[9] + four;
                }
                else if(random2 == 11){
                    four = names[10] + four;
                }
                else if(random2 == 12){
                    four = names[11] + four;
                }
                else if(random2 == 13){
                    four = names[12] + four;
                }
                else if(random2 == 14){
                    four = names[13] + four;
                }
                 System.out.println(four);
            }
            i++;
        }
           
            
           
            
            
            /*
            for(int a=0; a<theDeck.length; a++){
                theDeck[a]=a;
            }
            
            for(int b=0; b<5; b++){
                int random2 = (int)(Math.random()*((52-0)+1));
                
                for(int c=0; c<13; c++){
                    if(theDeck[c]==random2){
                        theHand[c] = theDeck[random2]; //the first  number equals the random number of the deck
                        theDeck[random2] = negativeone; //the deck with the random number equals -1
                        con = theDeck[random2];
                        theDeck[random2] = theDeck[c];
                        theDeck[c] = con;
                    }
                    System.out.println(theDeck[c]);
                }
            }
            
            for(int z=0; z<4; z++){
                System.out.println(theDeck[z];
            }
            
            */
            
            /*
                int suit = deck[i]/13;
                
                for(int z = 0; z<)
                int rank = deck[i]%13;
              
            switch({
                case 0: "Ace"; break;
                case 1: "King"; break;
                case 2: "Queen"; break;
                case 3: "Jack"; break;
                case 4: theDeck[10]; break;
                case 5: 
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 13:
                
            }
            
            
            
            
            
           */ 
            
        }
        
        
        
    
        
        
    }












/*
    Clubs:    J 4 
    Diamonds: 
    Hearts:   J 7 4 
    Spades:   

    Go again? Enter 'y' or 'Y', anything else to quit- y
    Clubs:    Q 2 
    Diamonds: A 
    Hearts:   5 
    Spades:   J 

    Go again? Enter 'y' or 'Y', anything else to quit- q
    rank   freq of exactly one pair
        A       312
        K       307
        Q       339
        J       325
        10       323
        9       334
        8       363
        7       312
        6       339
        5       349
        4       328
        3       293
        2       327
    ----------------------------
 total not exactly one pair: 5749
*/
