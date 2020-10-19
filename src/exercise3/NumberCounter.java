package exercise3;

import java.util.Scanner;

public class NumberCounter {

  public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int positivenumbers =0;
    int negativenumbers =0;
    float Sume =0f;
    while (true)
    {
      System.out.print("eine unbestimmte Anzahl von Ganzzahlen eingeben:");
      int number =input.nextInt();
      if (number==0)
      {
      break;  
      }
      else 
      {
        if (number>0)  
        {
        positivenumbers=positivenumbers + 1;  
        }
        else
        {
        negativenumbers=negativenumbers + 1;  
        }
        Sume=Sume + number;

      }    
    
    
    }
    System.out.println("Positive numbers:" + positivenumbers);
    System.out.println("Negative numbers:" + negativenumbers);
    System.out.println("Sum:" +Sume );
    System.out.println("Average:" +Sume/(positivenumbers+negativenumbers));
    
    
    
    
    
  }
}