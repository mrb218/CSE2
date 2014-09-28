////////////////////////////////////////////////
//Mackenzie Burns
//September 17, 2014
//lab05 - RandomGames.java

import java.util.Scanner;
//
//
public class RandomGames {
        //main method required for every Java Program
        public static void main (String[] args) {
         
    
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    int numberR, numberC, numberc, totalC, numberP, cardP, card1, card2;
    string card1 = "";
    string card2 = "";
    string Ace, King, Queen, Jack;
    
    numberR = (int)(Math.random()*((37-0)+1)); //random number for roulette
    numberC = (int)(Math.random()*((7-0)+1)); //random number for craps dice 1
    numberc = (int)(Math.random()*((7-0)+1)); //random number for craps dice 2
    totalC = numberC + numberc;//total value from two dice
    numberP = (int)(Math.random()*((11-0)+1));
    cardP = (Math.random()*((4-0)+1)); 
    card1 = (int)(Math.random()*((14-2)+1));
    card2 = (int)(Math.random()*((4-0)+1)); //the card number
    
    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
    String game=myScanner.next();
    
        switch(game){
            case "r":{
                
                System.out.println("Roulette: "+numberR+""); //print out the random number for roulette
        }
            break;
            case "R":{
                 System.out.println("Roulette: "+numberR+""); //print out the random number for rou
            }
            break;
            case "c": {
                 System.out.println("Craps: "+numberC+"+"+numberc+"="+totalC+"."); //print out the 2 random dice numbers and add them up
            }
            break;
            case "C": {
                System.out.println("Craps: "+numberC+"+"+numberc+"="+totalC+"."); //print out the 2 random dice numbers and add them up
            
            }
            break;
            case "p":
            case "P": {
                
                switch(card1){
                    
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        {
                        card1 = "Ace";
                        }
                    break;
                    case 12: 
                        {
                        card1 = "King";
                    }
                    break;
                    case 13: {
                        card1 = "Queen";
                }
                    break;
                    case 14: {
                        card1 = "Jack";
                    }
                    break;
                }
            
                switch(card2){
                    case 1: {
                        System.out.println(""+card1+" of diamonds.");
                    }
                    break;
                    case 2: {
                        System.out.println(""+card1+" of hearts.");
                    }
                    break;
                    case 3:
                    {
                        System.out.println(""+card1+" of spades.");
                    }
                    break;
                    case 4:
                        {
                        System.out.println(""+card1+" of clubs.");
                    }
                        
                    break;
                   
                
            
            
            default: 
            {
                System.out.println(""+game+" is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
                }
                break;
            }
            }
            
        }
        
    
        }
}


