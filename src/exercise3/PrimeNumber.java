package exercise3;

import java.util.Scanner;

public class PrimeNumber {

  public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    System.out.print("eine Zahl mehr als 2: ");
    int number =input.nextInt();
    int number2=2;
    boolean isprime=true;
    while(number2<number)
    {
    
      if (number%number2==0)  
      {
      System.out.println("nicht Primezahl"); 
      isprime=false; 
      }    
      number2=number2 +1;  
      
     }  
     if (isprime)
    {
    System.out.println("Primezahl");  
    } 
  
  }
}