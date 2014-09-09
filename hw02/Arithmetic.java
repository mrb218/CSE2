////////////////////////////////////////
//Mackenzie Burns
//Arithmetic Java Program
//
//  First compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//
        
//  define a class
public class Arithmetic{
    //main method required for every Java program
    public static void main(String[] args)  {
        
//Number of pairs of socks
  int nSocks=3;
  //Cost per pair of socks
  //('$' is part of the variable name)
  double sockCost$=2.58;
  
  //Number of drinking glasses
  int nGlasses=6;
  //Cost per glass
  double glassCost$=2.29;
  
  //Number of boxes of envelopes
  int nEnvelopes=1;
  //cost per box of envelopes
  double envelopeCost$=3.25;
  double taxPercent=0.06;
  
  //Total costs before taxes
  double totalSockCostb$= nSocks*sockCost$; //total cost of socks
  double totalGlassCostb$= nGlasses*glassCost$; //total cost of glasses
  double totalEnvelopeCostb$= envelopeCost$*nEnvelopes; //total cost of envelopes
  
  //Total Costs after taxes
  double totalSockCost$= totalSockCostb$+(totalSockCostb$*taxPercent);
  double totalGlassCost$= totalGlassCostb$+(totalGlassCostb$*taxPercent);
  double totalEnvelopeCost$= totalEnvelopeCostb$+(totalEnvelopeCostb$*taxPercent);
  
  //print the total cost of socks
  System.out.println("The total cost of socks is "+nSocks*sockCost$+" dollars before tax");
  System.out.println("The sales tax of socks is "+nSocks*taxPercent+" dollars");
  
  //print the total cost of drinking glasses
  System.out.println("The total cost of glasses is "+glassCost$*nGlasses+" dollars before tax");
  System.out.println("The sales tax of glasses is "+nGlasses*taxPercent+" dollars");
  
  //print the total cost of Envelopes
  System.out.println("The total cost of envelopes is "+nEnvelopes*envelopeCost$+" dollars before tax");
  System.out.println("The sales tax of envelopes is "+envelopeCost$*taxPercent+" dollars");
  
  //print the total costs after tax
  System.out.println("The total cost of socks is "+totalSockCostb$ + (totalSockCostb$*taxPercent)+" dollars after tax");
  System.out.println("The total cost of glasses is "+totalGlassCostb$+(totalGlassCostb$*taxPercent)+" dollars after tax");
  System.out.println("The total cost of envelopes is "+totalEnvelopeCostb$+(totalEnvelopeCostb$*taxPercent)+" dollars after tax");

  //print the total cost 
  System.out.println("You pay "+totalSockCostb$+totalGlassCostb$+totalEnvelopeCostb$+" dollars for items before tax");
  System.out.println("You pay "+totalSockCost$+totalGlassCost$+totalEnvelopeCost$+" dollars for items after tax");

  double totalitemcostb$= totalSockCostb$+totalEnvelopeCostb$+totalGlassCostb$; //total cost of items before taxes
  double totalitemcost$= totalSockCost$+totalEnvelopeCost$+totalGlassCost$; //total cost of items after taxes
  
  
    }
}