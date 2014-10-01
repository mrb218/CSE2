////////////////////////////////////////////////
//Mackenzie Burns
//September 17, 2014
//hw05 - BurgerKing.java


import java.util.Scanner;
//
//
public class BurgerKing {
        //main method required for every Java Program
        public static void main (String[] args) {
         
    
    Scanner myScanner;
    myScanner = new Scanner (System.in);
    
    
    
    
    //asking user to enter a letter for the type of food they want
System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), or Fries (F or f): ");
    String food=myScanner.next();
    
    switch(food){
            case "B":
            case "b":{ //if they want a burger, they can enter a letter for the topping
                System.out.print("Enter a letter to indicate the topping- all the fixins (A or a), cheese (C or c), none of the aboce (N or n).");
                String topping=myScanner.next();
                switch(topping){
                    case "A":
                    case "a": { //if they want all the fixins on their burger
                        System.out.println("You ordered a burger with 'all the fixins'.");
                        }
                        break;
                    case "C":
                    case "c":{ //if they want a burger with cheese
                         System.out.println("You ordered a burger with cheese.");
                        }
                        break;
                    case "N":
                    case "n": { //if they want a plain burger
                        System.out.println("You ordered a burger with no fixins.");
                        }
                        break;
                    default:  //if they did not enter a letter that is specified
                    System.out.println("You did not enter any of B, b, S, s, F, or f.");
                }
                //they can enter a letter if they want another type of food
            System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), or Fries (F or f): ");
   
            }
    }
        switch(food){    
            case "S":
            case "s": { //if they want a soda, they can enter a letter for the type of soda
                System.out.print("Do you want a Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m)?");
                String soda=myScanner.next();
                switch(soda){
                    case "P":
                    case "p":{ //if they ordered a pepsi
                        System.out.println("You ordered a Pepsi.");
                        }
                        break;
                    case "C":
                    case "c": { //if they ordered a coke
                        System.out.println("You ordered a Coke.");
                        }
                        break;
                    case "S":
                    case "s":{ //if they ordered a sprite
                        System.out.println("You ordered a Sprite.");
                        }
                        break;
                    case "M":
                    case "m": {    //if they ordered a mountain dew
                        System.out.println("You ordered a Mountain Dew.");
                        }
                        break;
                    } //they can enter a letter if they want another type of food
                System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), or Fries (F or f): ");
    
            }
        }
            switch(food){
            case "F":
            case "f": { //if they ordered fries, they can choose before a large or small
                System.out.print("Do you want a large or small order of fries (L, l, S, or s)?");
                String fries=myScanner.next();
                switch(fries){
                    case "L":
                    case "l":{ //if you ordered a large fries
                        System.out.println("You ordered large fries.");
                        }
                        break;
                    case "S":
                    case "s":{ //if you ordered a small fries
                        System.out.println("You ordered small fries.");
                        }
                        break;
                }
                }
                 
            
            
            default: 
            //if they did not enter a specified letter
            System.out.println("You did not enter any of B, b, S, s, F, or f.");
            
            }
        }
}
            