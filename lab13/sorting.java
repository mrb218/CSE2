//Mackenzie Burns
//December 4, 2014
//lab13 sorting.java

import java.util.Random;
public class sorting{
    
    public static void main(String arg[]){
        
        int newArray [][] = new int[5][];
        int counter = 0;
        for(int a=0; a<5; a++){
            newArray[a] = new int[a*3+5];
        }
        
        for(int b=0; b<5; b++){
            for(int c=0; c<b*3+5; c++){
                newArray[b][c] = 0 + (int)(Math.random()*39);
            }
        }
        
        System.out.println();
        System.out.println("The array before sorting: ");
            for(int d=0; d<5; d++){
                for(int e=0; e<d*3+5; e++){
                    System.out.print(newArray[d][e] + " ");
                }
                System.out.println();
            }
        
        System.out.println();
        System.out.println();
        System.out.println("The array after sorting: "); 
        
            for(int x=0; x<5; x++){ //how long the array is
                for(int a=0; a<newArray[x].length-1; a++){
                    for(int j=a+1; j<newArray[x].length; j++)//no bracket
                        if(newArray[x][a] < newArray[x][j]){
                            counter = newArray[x][a];
                            newArray[x][a] = newArray[x][j];
                            newArray[x][j] = counter;
                        }
                    }
                }
                
            for(int y=0; y<5; y++){
                for(int z=0; z<y*3+5; z++){
                    System.out.print(newArray[y][z] + " ");
                }
            System.out.println();
            }
     }
        
        
    }
    
    
