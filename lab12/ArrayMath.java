////////////////////////////////////////////////
//Mackenzie Burns
//November, 2014
//lab12 - ArrayMath.java


public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    /*System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
*/
  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static double equals(double [] x, double [] y){
      double [] number1 = double [number1.length];
      double [] number2 = double [number2.length];
      if (number1.length == number2.length){ //same length
          if(number1[x] == number2[y]){
              System.out.println("True");
          }//closes if statement
         
      }//closes outer if statement
      
  }
  
  public static int addArrays(int x[], int y[]){
    
    int [] sum = new int [sum.length];
    int [] numbers1 = new int [numbers1.length];
    int [] numbers2 = new int [numbers2.length];
    
    
    int zeros = 0;
        if(numbers1.length == numbers2.length){
    
        }
        else if(number1.length > number2.length){
            zeros = number1.length - number2.length; //number of extra zeros
            //add zeros(number of zeros) to the end of number2
            return;
        }
        else{
            zeros = number2.length - number1.length; //number of extra zeros in number2
            //add zeros to the end of number1
            return;
        }
        
    
    for(int row = 0; row < numbers1.length; row++){
        int all = 0;
        for(int j=0; j<numbers2[row].length; j++){
            sum[] = numbers1[x] + numbers2[b];
            return sum;
        }
    }
        
  }
  
  
  
}//closes class

//output:
/*
OUTPUT: {2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   = {4.6, 6.0, 8.0, -4.2, 164.0, 46.0}
{2.3, 3.0, 4.0, -2.1, 82.0, 23.0} 
  + {2.3, 13.0, 14.0}
   = {4.6, 16.0, 18.0, -2.1, 82.0, 23.0}
It is true that {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
   == {2.3, 3.0, 4.0, -2.1, 82.0, 23.0}
It is false that {2.3, 13.0, 14.0}
   == {2.3, 13.0, 14.0, 12.0}
It is false that {2.3, 12.0, 14.0}
   == {2.3, 13.0, 14.0}
*/