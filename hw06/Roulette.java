////////////////////////////////////////////////
//Mackenzie Burns
//October, 2014
//hw06 - Roulette.java


import java.util.Scanner;
//
//
public class Roulette {
        //main method required for every Java Program
        public static void main (String[] args) {
         
    
    int number, number1, input;
   
    
            
    int repetitions = 1;
    int countZero = 0;
   
    int profitTotal$ = 0;
    int profitcounter = 0;

    
while (repetitions <= 1000) { //there will be 1000 repetitions
        int money$ = 100; //initial money is 100
        int spins = 1;
        number = (int)(Math.random()* 37+1); //random first number
    while (spins <= 100) { //100 spins
       number1 = (int)(Math.random()*37+1); //random second number
        if (number == number1){
           money$ +=36; //if you have the same numbers, you gain 36
           
           profitTotal$ +=36; //your profit total will add 36 also
           spins++;
        }
        else {
            money$ -= 1; //if you dont have the same numbers, the money will subtract one from 100
            
            profitTotal$ -=1; //your profit total will decrease also
            spins++; //spin counter 
            }
        
        if (money$ == 0){ //if money is equal to zero
            countZero++; //zero counter
        }
    }
    if(money$>100) { //if the money is greater than 100
        profitcounter++; //the person earned money, counts times of profit
    }
    
    
    repetitions++; //repeat repetitions starting over
}
    System.out.println("The number of times you lose everything is " +countZero); //number of times you lose
    System.out.println("The number of times you make money is " +profitcounter); //number of times you make money
    System.out.println("The profit is $" +profitTotal$); //your total profit
    
    
   
        }
}