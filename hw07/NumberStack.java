////////////////////////
//Mackenzie Burns
//October 2014
//hw07 - NumberStack.java

import java.util.Scanner;
   
    public class NumberStack{
    	public static void main(String[] arg){
    
    
        Scanner numberInput=new Scanner(System.in);
        
    
        System.out.print("Enter an int between 1 and 9- " );
        int input = numberInput.nextInt();
        
        
    //for loop

    if (input >=1 && input <=9){ //make sure the input is inside the bounds
         
        int a=0;
        int b=0;
        int c=0;
        int e=0;
        int i=input;
        int d=0;
        
//first use for loop 

    for(a=1; a<=input; a++){ //amount of lines for the input
    	
    	 for(b=1; b<=a; b++){ //amount of times 
    	        
    	       for(c=1; c<=i; c++){ //the number
    	        
    	            System.out.print ("  ");
    	        }
    	        for(e=1; e<=2*a-1; e++){ //number of numbers in a row
    	           
    	            System.out.print(a);
    	       }
    	            System.out.println(); //makes sure the dashes show up on the next line
    	   }//end of second for statement
    	   
    	   for (c=1; c<=i; c++){  //the numbers
    	       System.out.print ("  ");
    	   }//end of fifth for statement
    	   
    	   for (d=1; d<=2*a-1; d++){ //prints the number of dashes
    	       System.out.print("-");
    	   }//end of sixth for statement
    	    
    	 System.out.println();//so it can print on a new line
        
        i--;
	    
    	 
    }//end of first for statement
    
     
//next use while loops

 a = 1;
 i=input;
    while(a<=input){ //runs amount of lines for the input
        b=1; //b initialized
        while (b<=a){ //runs amount of lines
            c=1; //c initialized
            while (c<=i){
                System.out.print ("  ");
                c++; //c incremented
            }//end of third for loop
            e=1; //e initialized
            while (e<=(2*a-1)){ //runs when e is less than or equal to 2*a-1
                System.out.print(a);
                e++; //e incremented
            }//end of fourth for loop
            System.out.println();
            b++; //b incremented
         } //end of second for statement
         c=1; //c initialized
        while(c<=i){ //running until c is greater than input
            System.out.print ("  ");
            c++; //c incremented
        }
        d=1; //d incremented
        while(d<=(2*a-1)){ //runs when d is less than or equal to 2*a-1
            System.out.print("-"); //prints out the dashes
            d++; //d incremented
        }
    System.out.println(); 
     a++; //a incremented
     i--; //i decremented
    }
    
    
//now use do while loops
   i=input;
    a=1;//need to initialize a
    do{
        b=1;//need to initialize b
        do{
            c=1; //need to initialize c
            
            do{
                System.out.print ("  ");
                c++;
            }while (c<=i); //running until c is greater than the input
            e=1; //need to initialize e
            do{
               System.out.print(a); //prints the numbers
                e++; //e ingremented 
            }while (e<=(2*a-1)); //running until e is greater than 2*a-1
            System.out.println();
            b++; //b incremented
        }while (b<=a); //running until b is greater than a
        c=1;//need to initialize c
        do{
           System.out.print ("  ");  //prints our the numbers
            c++; //c incremented
        }while(c<=i); //running until c is greater than i
        d=1; //need to initialize d
        do{
            System.out.print("-"); //prints out the dashes
            d++; //d increments
        }while(d<=(2*a-1)); //runs when d is less than or euqal to 2*a-1
    System.out.println(); //make sure the next info is on the next line
    a++;
    i--;
}while (a<=input); //will stop running when a is greater than the input
    
    
}//end of if statement
    	   
    
    else{
        System.out.println("You did not enter input in the range.");
    }
    
    	}
}
    
        