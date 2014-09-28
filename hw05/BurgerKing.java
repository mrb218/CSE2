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
    
    
    
    
    
System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), or Fries (F or f): ");
    String food=myScanner.next();
    
    switch(food){
            case "B":
            case "b":{
                System.out.print("Enter a letter to indicate the topping- all the fixins (A or a), cheese (C or c), none of the aboce (N or n).");
                String topping=myScanner.next();
                switch(topping){
                    case "A":
                    case "a": {
                        System.out.println("You ordered a burger with 'all the fixins'.");
                        }
                        break;
                    case "C":
                    case "c":{
                         System.out.println("You ordered a burger with cheese.");
                        }
                        break;
                    case "N":
                    case "n": {
                        System.out.println("You ordered a burger with no fixins.");
                        }
                        break;
                    default: 
                    System.out.println("You did not enter any of B, b, S, s, F, or f.");
                }
                
            System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), or Fries (F or f): ");
   
            }
    }
        switch(food){    
            case "S":
            case "s": {
                System.out.print("Do you want a Pepsi (P or p), Coke (C or c), Sprite (S or s), or Mountain Dew (M or m)?");
                String soda=myScanner.next();
                switch(soda){
                    case "P":
                    case "p":{
                        System.out.println("You ordered a Pepsi.");
                        }
                        break;
                    case "C":
                    case "c": {
                        System.out.println("You ordered a Coke.");
                        }
                        break;
                    case "S":
                    case "s":{
                        System.out.println("You ordered a Sprite.");
                        }
                        break;
                    case "M":
                    case "m": {    
                        System.out.println("You ordered a Mountain Dew.");
                        }
                        break;
                    }
                System.out.print("Enter a letter to indicate a choice of Burger (B or b), Soda (S or s), or Fries (F or f): ");
    
            }
        }
            switch(food){
            case "F":
            case "f": {
                System.out.print("Do you want a large or small order of fries (L, l, S, or s)?");
                String fries=myScanner.next();
                switch(fries){
                    case "L":
                    case "l":{
                        System.out.println("You ordered large fries.");
                        }
                        break;
                    case "S":
                    case "s":{
                        System.out.println("You ordered small fries.");
                        }
                        break;
                }
                }
                 
            
            
            default: 
            
            System.out.println("You did not enter any of B, b, S, s, F, or f.");
            
            }
        }
}
            