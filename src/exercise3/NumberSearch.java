package exercise3;

import java.util.Scanner;

public class NumberSearch {

  public static void main(String[] args) {
  int y=0;
  for ( int number= 100;number<1000;number=number + 1)  
  {
   if (number%5==0 || number%6==0) 
   {
   y=y + 1;  
   System.out.print(number + " " );
   if (y%10==0)
   {
   System.out.println();

   }
   } 
   
   }
  
  
  
  
  
  }
  }