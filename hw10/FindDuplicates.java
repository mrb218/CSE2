/////////////////////////////////////
//Mackenzie Burns
//HW10 FindDuplicates.java
//November 2014


import java.util.Scanner;
public class FindDuplicates{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        String answer="";
            do{
                System.out.print("Enter 10 ints- ");
                for(int j=0;j<10;j++){
                    num[j]=scan.nextInt();
                }
                    String out="The array ";
                    out+=listArray(num); //return a string of the form "{2, 3, -9}"   
                if(hasDups(num)){
                    out+="has ";
                }
                else{
                    out+="does not have ";
                }
                    out+="duplicates.";
                    System.out.println(out);
                    out="The array ";
                    out+=listArray(num);    
               if(exactlyOneDup(num)){
                    out+="has ";
                }
                else{
                    out+="does not have ";
                } 
                    out+="exactly one duplicate.";
                    System.out.println(out);
                System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
                answer=scan.next();
            }while(answer.equals("Y") || answer.equals("y"));
        }

    public static String listArray(int num[]){
        String out="{";
        for(int j=0;j<num.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=num[j];
        }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int [] user){
      for (int a = 0; a < user.length; a++){
          for (int b = 0; b < user.length; b++){
              if(user[a] == user[b] && a!=b){
                  return true;
              }
          }
      }
      return false;
  }
  
  public static boolean exactlyOneDup(int [] user2){
      Boolean answer = false;
      int counter = 0;
      for (int a = 0; a < user2.length; a++){
          for (int b = 1+a; b < user2.length; b++){
              if(user2[a] == user2[b]){
                  counter++;
              }
          }
      }
     if (counter == 1){
         return answer = true;
     }
     return answer;
  }
 
  
}

