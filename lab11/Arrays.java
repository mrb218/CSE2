////////////////////////
//Mackenzie Burns
//November 2014
//Lab11 - Arrays.java


import java.util.Scanner;

public class Arrays{
    public static void main(String[] arg){
        
        Scanner myScanner;
       
        int [] numbers = new int[10];
        
        System.out.print("Enter 10 ints: ");
        Scanner integers = new Scanner(System.in);
        for (int a=0; a<10; a++){
            numbers[a]=integers.nextInt();
        }
            
            int max = 0;
            int min = 0;
            
            for(int b=0; b<numbers.length; b++){
                
                
                if (max < numbers[b]){ //the max number
                    max = numbers[b];
                }
            }
            for(int d=0; d<numbers.length; d++){
                
                
                if (min > numbers[d]){ //the min number
                    min = numbers[d];
                }
                
            }
            
        int sum = 0;
        for (int c = 0; c <numbers.length; c++){
            sum += numbers[c];
        }
        
        System.out.println("The lowest entry is " +min);
        System.out.println("The highest entry is " +max);
        System.out.println("The sum of the input is " +sum);
        
        
        
        int [] numbers2 = new int[10];
        
        
        System.out.println(numbers[0] + "   "+ numbers[9]);
        System.out.println(numbers[1] + "   "+ numbers[8]);
        System.out.println(numbers[2] + "   "+ numbers[7]);
        System.out.println(numbers[3] + "   "+ numbers[6]);
        System.out.println(numbers[4] + "   "+ numbers[5]);
        System.out.println(numbers[5] + "   "+ numbers[4]);
        System.out.println(numbers[6] + "   "+ numbers[3]);
        System.out.println(numbers[7] + "   "+ numbers[2]);
        System.out.println(numbers[8] + "   "+ numbers[1]);
        System.out.println(numbers[9] + "   "+ numbers[0]);
        
        
        
        
    }
}