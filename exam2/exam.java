////////////////////////
//Mackenzie Burns
//November 2014
//Exam2 - Exam.java

public class exam{
     public static void main(String []  arg){
       
 int i=0;
 int j=1;
 for(i=1; i<4; i++){
        for(j=1;j<3;j++){
            for(int k=0; k<j; k++){
                System.out.println("(" + i +"," +j+")");
            
            }
        }
        i++;
 }
}
}