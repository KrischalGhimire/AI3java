import java.util.Scanner;

/**
 * Write a description of class Workshop2_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop2_5
{
   public static void main(String[]args)
   {
       //Question 8
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter the Second Number");
        int secondNumber=sc.nextInt();
        System.out.println("Enter the Third Number");
        int thirdNumber=sc.nextInt();
        int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
        int biggest=(bigger>thirdNumber)?bigger:thirdNumber;
        System.out.println("The biggest number among three number is :"+biggest);
   }
}