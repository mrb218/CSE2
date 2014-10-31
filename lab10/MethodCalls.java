////////////////////////
//Mackenzie Burns
//October 2014
//Lab10 - MethodCalls.java

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90)); 
    }
    
    public static int addDigit(int b, int a){
        int end=0; //final product initializied
        String first, second, third; //make three strings
        if(a>0 && b>0){ //if both numbers are positive
            first = "" + a; //the first int converted to a string so it can be added to the digit
            second = "" + b; //the second int converted to a string so it can be added to the digit
            third = first + second; //need to add the first string to the second
            end = Integer.parseInt(third); //completing the switch from int to string
        }
        else if(a<0 && b>0){ //if a is negative and b is positive
            first = "" + (a*-1); //the first int converted to a string...need to make sure that a turns positive so multiply by -1
            second = "" + b; //the second int converted to a string so it can be added to the digit
            third = first + second; //the first plus the second string
            end = Integer.parseInt(third); //completing the switch from int to string
            end = end*-1; //need to make the answer negative
        }
        else if(b<0 && a>0){ //if b is negative and a is positive
            first = "" + a; //the first int converted to a string so it can be added to the digit
            second = "" + (b*-1); //the second int converted to a string...need to make sure that b turns positive so multiply by -1
            third = first + second; //the first plus the second string
            end = Integer.parseInt(third); //completing the switch from int to string
            end = end*-1; //need to make answer negative
        }
        else if (b<0 && a<0){ //if both numbers are negative 
            first = "" + (a*-1);//the first int converted to a string...need to make sure that a turns positive so multiply by -1
            second = "" + (b*-1);//the second int converted to a string...need to make sure that b turns positive so multiply by -1
            third = first + second; //the first string plus the second string
            end = Integer.parseInt(third); //completes switch from int to string
            
        }
        return end; //return the final product
    }
    
    public static int join(int d, int e){
        int f = addDigit(e, d); //need to add the addDigit method so it works with join method
        return f;
    }
}
    
    
    
    
 /*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/   




