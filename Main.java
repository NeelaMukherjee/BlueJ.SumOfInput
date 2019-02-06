/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    public static void main(){
        
       getSum(); 

    }
    
    public static void getSum (){
    int i;
    int Sum =0;
    Scanner num = new Scanner(System.in);
    System.out.println("Enter a number to get the sum of the numbers from 1 to your number");
    int guess = num.nextInt(); 
    
    for(i=1;i<=guess;i++){
        
        
        Sum =Sum+i;
      
        
        
    }
      System.out.println("The sum of the numbers from 1 to "+guess+" is = "+Sum);  
    }
}
