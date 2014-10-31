////////////////////////
//Mackenzie Burns
//October 2014
//Hw08 - HW8.java


import java.util.Scanner;
public class HW8{
	
 public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc"); //the string
	System.out.println("You entered '"+input+"'");
	
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //enter one of these
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	
	input=getInput(scan,"Choose a digit.","0123456789"); //choose one of these digits
	System.out.println("You entered '"+input+"'");
	
	}  
	
public static char getInput(Scanner scan1, String a){
    if (a.length()>0){
        char x1= a.charAt(0); //when they enter char "C"
        char x2= a.charAt(1); //when they enter char "c"
        scan1 = new Scanner (System.in);
        String input=scan1.nextLine();//takes in a String from the input
        char i1 = input.charAt(0); //takes the first level of input only
       
        if(input.length()==1){ //change to a while loop
            if (i1==x1){
        		    return x1; //return C
        		}
            else if (i1==x2){
                return x2; //return c
                }
        }
    else{
        System.out.println("You should enter exaclty one character. Enter 'c' or 'C'. Try again- ");//need to enter only one character
        return getInput(scan1, a); //return this so they can enter one character
    }
        }	
        System.out.print("You did not enter a character from the list 'Cc' try again- "); //user did not enter either C or c. 
        return getInput(scan1, a); //return so they can enter either C or c
        	
    }
    
public static char getInput(Scanner scan1, String b, int c){
            int s;
        for (s=0; s<c; s++){ //there can only be 5 trials or else it quits
            char y1 = b.charAt(0); //first character of the string b - y
            char y2 = b.charAt(1); //second character of string b - Y
            char y3 = b.charAt(2); //third character of the string - n
            char y4 = b.charAt(3); //fourth character of string b - N
            
            scan1=new Scanner (System.in);
            String input=scan1.nextLine(); //stores what we put in as the string
            
            char i1 = input.charAt(0);
            
            if(input.length()==1){ //if the length of the input is only one character
                if(i1==y1){ 
                    return y1; //returning y
                }
                else if (i1==y2){
                    return y2; //returning Y
                }
                else if (i1==y3){
                    return y3; //returning n
                }
                else if (i1==y4){
                    return y4; //returning N
                }
                else{
                    System.out.println("You did not enter a character from the list. Enter 'y' or 'Y' or 'n' or 'N'. Try again- "); //needs to enter one of the 4 options
                    
                }
            }
            else{
                System.out.println("You should enter exactly one character. Try again - "); //user needs to enter exactly one character
                
            }
        
        }//ending for loop
        System.out.println("You failed after 5 times."); //the method exits out because the user did not enter an appropriate letter in 5 times or less
       return ' ';  //return ' ' becuase its a char
    }
   
public static char getInput(Scanner scan2, String m, String n){
    System.out.println("Choose a digit");
    System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', or '9'- "); //enter one of these numbers
    
    char z1 = n.charAt(0);  //first character of the string of digits - 0
    char z2 = n.charAt(1); //second character of the string of digits - 1
    char z3 = n.charAt(2); //third character of the string of digits - 2
    char z4 = n.charAt(3); //fourth character of the string of digits - 3
    char z5 = n.charAt(4); //fifth character of the string of digits - 4
    char z6 = n.charAt(5); //sixth character of the string of digits - 5
    char z7 = n.charAt(6); //seventh character of the string of digits - 6
    char z8 = n.charAt(7); //eighth character of the string of digits - 7
    char z9 = n.charAt(8); //ninth character of the string of digits - 8
    char z10 = n.charAt(9);  //tenth character of the string of digits - 9
    
    scan2 =new Scanner(System.in);
    String input = scan2.nextLine();
    
    char i1 = input.charAt(0);
    
    if(input.length()==1){ //if the input is exactly one character
        if(i1==z1){ //if the input is 0
            return z1;
        }
        else if(i1==z2){ //if the input is 1
            return z2;
        }
        else if(i1==z3){ //if the input is 2
            return z3;
        }
        else if(i1==z4){ //if the input is 3
            return z4;
        }
        else if(i1==z5){ //if the input is 4
            return z5;
        }
        else if(i1==z6){ //if the input is 5
            return z6;
        }
        else if(i1==z7){ //if the input is 6
            return z7;
        }
        else if(i1==z8){ //if the input is 7
            return z8;
        }
        else if(i1==z9){ //if the input is 8
            return z9;
        }
        else if(i1==z10){ //if the input is 9
            return z10;
        }
        else{
            System.out.println("You did not enter one of the digits '0', '1', '2', '3', '4', '5', '6', '7', '8', or '9'. Try again- "); //user either entered a letter or a number other than listed.
            return getInput(scan2, m, n); //return so that the user can enter a number listed
        }
    }
    else{
        System.out.println("You should enter exactly one character. Try again- "); //user needs to enter only one character
        return getInput(scan2, m, n); //return so that the user can enter one character
        
        }

}
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

