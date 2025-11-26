package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class NestedIfExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedIfExample
{
   public static void main(String[]args)
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number:");
       int num1=sc.nextInt();
       if(num1%3==0)
       {
           if(num1%5==0)
           {
               System.out.println("Number is divisible by both 3 and 5");
           }
           else
           {
               System.out.println("Number is divisible by 3 only");
           }
       }
       else
       {
           if(num1%5==0)
           {
               System.out.println("Number is divisible by 5 only");
           }    
           else
           {
               System.out.println("Number is not divisible by both 3 and 5!");
           }
       }
   }
}