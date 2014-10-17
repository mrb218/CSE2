////////////////////////
//Mackenzie Burns
//October 2014
//Lab08 - MoreLoops.java

import java.util.Scanner;
   
    public class MoreLoops{
    	public static void main(String[] arg){
    
    
        Scanner scan=new Scanner(System.in);
        int n=0;
    
        System.out.print("Enter an int- ");
    
        /*while(!scan.hasNextInt()){
    	    scan.next(); //get rid of the junk entered by user
    	    System.out.print("You did not enter an int; try again- ");
    }   */ 

        
        do {
            if(!scan.hasNextInt())  {
               scan.next(); 
                System.out.print("You did not enter an int; try again- ");
            }
        } while (!scan.hasNextInt());
       //yay!! 
       
       
       ///////////////////////////////////////////////
      
       /* n=scan.nextInt();
        for(int j=0;j<n && j<40;j++){
    	    for(int k=0;k<j+1;k++){
   	            System.out.print('*');
    	        }
    	    System.out.println();
            } */
        //now turn into a while statement
        
        n=scan.nextInt();
        int j, k;
        j=0;
          
            while (j<n && j<40){
              k=0;
                while (k<j+1){
                    System.out.print('*');
                    k++;
                }
                System.out.println();
                j++;
           } 
        //yay!
    ///////////////////////////////////////////////
    /*
    int k=4;
        do{
	        System.out.println("k="+k);
	        k++;
	       }
         while(k<4);
    */
        //now convert this to a while loop
        
       int a=0;
       while(a<4){
            System.out.println("k="+a);
	        a++;
       }
    	    //yay!!
    	   
    ///////////////////////////////////////////////
    /*
    int count=0;
        while(true){
	        switch(n){
	        default: System.out.println(n + " is > 5 or <1");
		  break;
	        case 1: 
	        case 2: System.out.print("Case 2 "); 
		  continue;
	        case 3: break;
	        case 4: System.out.println("Case 4");
	        case 5: System.out.println("Case 5");
		  break;
	        }
	        count++;
	    if(count>10)
		break;
        } */
        //now convert into for loops and if statements
        
        for(int count=0; count<10; count++){
            if(n==1){
                
            }
            else if(n==2){
                System.out.print("Case 2 "); 
                continue;
            }
            else if(n==3){
                break;
            }
            else if(n==4){
                System.out.println("Case 4");
                System.out.println("Case 5");
                continue;
            }
            else if(n==5){
                System.out.println("Case 5");
                System.out.println("Case 4");
                continue;
            }
            else{
                System.out.println(n + " is > 5 or <1");
                continue;
            }
            break;
        }
        
        
        
        
    	}
} 