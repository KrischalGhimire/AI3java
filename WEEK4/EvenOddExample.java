package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class EvenOddExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOddExample
{
   public static void main(String[]args)
   {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num1=sc.nextInt();
        if(num1%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
   }
}