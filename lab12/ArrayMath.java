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
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

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
  
  public static Boolean equals(double [] x, double [] y){
      int temp;
      temp = 1;
      if (x.length == y.length){ //same length
          for(int a = 0; a<x.length; a++){
              if(x[a]!=y[a]){
              temp++;
          }
      }
      if(temp==0){
          return true;
      }
      else{
          return false;
      }
  }
  else{
      return false;
  }
  }
  
  public static double[] addArrays(double x[], double y[]){
    int temp2;
    temp2 =1;
   double end[] = new double[0];
        if(x.length == y.length){
            end = new double[x.length];
            for(int a = 0; a<y.length; a++){
                end[a] = x[a] + y[a];
            }
        }
         if(x.length > y.length){
            end = new double[x.length];
             for(int a = 0; a<y.length; a++){
                end[a] = x[a] + y[a];
                temp2++;
            } //number of extra zeros
            //add zeros(number of zeros) to the end of number2
            for(int b = temp2+1; b<x.length; b++){
                end[b] = x[b];
            }
        }
         if(x.length < y.length){
            end = new double[x.length];
             for(int a = 0; a<y.length; a++){
                end[a] = x[a] + y[a];
                temp2++;
            }
            for(int b = temp2+1; b<x.length; b++){
                end[b] = y[b];
            }
         }
         return end;
  }//closes method
        
        
        
    
  
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