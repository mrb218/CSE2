//////////////////////////////////////////////
//Mackenzie Burns
//Lab09 Methods
//October 22,2014

import java.util.Scanner;

    public class Methods{
        public static void main(String [] arg){
            
    Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	    System.out.println("The larger of "+a+", "+b+", and "+c+" is "+larger(a,larger(b,c)));
	    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+", and "+c+" are in ascending order");
        }
        
    public static int getInt(Scanner scan) {
    	
    	System.out.println("Enter an int: ");
    	int output = 0;
    	scan = new Scanner(System.in); //make a new scanner
    	
    	
    	
    	if(scan.hasNextInt()){ //myscanner = the input
    		int scan2 = scan.nextInt(); 
    		output = scan2; //return the scanner
    		
    	}
    	else{
    		System.out.println("You did not enter an int.");
    		output = getInt(scan);
    		
    	}
    return output;
    }
    
    public static boolean ascending(int first, int second, int third){ //the ascending method
    	boolean output;
    	if (first < second && second < third){ //option 1
    		output = true;
    	}
    	else {
    		output = false;
    	}
    	return output;
    }
	
	public static int larger(int first, int second){ //the larger method
		int result = 0;
		if (first > second){ //option 1
			result = first;
		}
		else{ //option 2
			result = second;
		}
		return result;
	}
	
	
	
        
}
