/////////////////////////////////////////////////////////////
//Mackenzie Burns
//HW09 BlockedAgain.java
//October 2014



import java.util.Scanner;

public class BlockedAgain{
    public static void main(String []s){
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }
    
    public static int getInt(){
        
        System.out.print("Enter an int between 1 and 9, inclusive: ");
        Scanner scan=new Scanner(System.in);
        int input = checkInt(scan); //refers to the checkInt method
        int range = checkRange(input); //referst to the checkRange method
        return range;
    } //closes getint method
    
    public static int checkInt(Scanner scan){ //checking if the user put an int or not
        int amount=0;
        while(!scan.hasNextInt()){ //if it is not an int
            System.out.print("You did not enter an int. Try again- "); //tell them to try to enter an int again
            scan.next();
        }
        amount = scan.nextInt();
        return amount;
    }
    
    public static int checkRange(int d){ //checking to make sure that it is between 1 and 9
        int amount=0;
         
        if (d<=9 && d>=1){ //if it is between 1 and 9
             amount = d;
            return amount; //return the input amount
            }
        else{ //if the input is not between 1 and 9
            System.out.print("You did not enter a number between 1 and 9, inclusive. Try again- ");
            amount=getInt(); //return back to getInt so that it can ask the user to input an int again
            return amount;
            }
            
    }
        
    public static void allBlocks(int x){ //allBlocks method 
        block(x); //go directly to the block method
    }
    
    public static void block(int y){ //block method
            //initiallizing the variables
            int l; 
            int m;
            int n;
            int o;
          
        
        for(l=1; l<y+1; l++){ //amount of times 
    	        
    	       for(m=0; m<l; m++){ //the number
    	        
    	            for(n=y; n>l; n--){ //this is for the spacing
    	                 System.out.print(" ");
    	            } //closes 3rd for loop
    	           
    	            for(o=0; o<l-1; o++){ //number of numbers in a row
    	           
    	            System.out.print(l + "" + l);
    	            }//closes fourth for loop
    	       System.out.println(l); //simple number prints
    	   }//end of second for statement
    	   for (int p =y; p>l; p--){
    	       System.out.print(" ");
    	   }
    	   line(l);
        }//closes first for loop
        }//closes the method
    
    
    public static void line(int l){ //method line
       int s;
        
        for(s=0; s<l-1; s++){ //amount of dashes
    	
    	    System.out.print("--");//for the dashes
        }
        
        System.out.println("-"); //the dashes
    	
        }
        
    
    
     
 
}//closes the class
        

    
    
    
    
    
    
    
    
    

