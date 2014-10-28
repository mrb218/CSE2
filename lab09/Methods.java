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
    	
    	System.out.print("Enter an int: ");
    	int output = 0;
    	Scanner scan2 = new Scanner(System.in);
    	
    	
    	if(scan.hasNextInt){ //myscanner = the input
    		
    		output = myScanner;
    		
    	}
    	else{
    		System.out.println("You did not enter an int.");
    		output = getInt(scan2);
    		
    	}
    	
    }
    
    public static boolean ascending(int first, int second, int third){ //the ascending method
    	boolean output;
    	if (first < second && second < third){ //option 1
    		output = true;
    	}
    	else {
    		output = false;
    	}
    }
	
	public static int larger(int first, int second){ //the larger method
		int result;
		if (first > second){ //option 1
			result = first;
		}
		else{ //option 2
			result = second;
		}
		return result;
	}
	
	
	
        
}
