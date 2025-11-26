package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class CalculateUsingSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculateUsingSwitch
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        System.out.println("Enter the operator");
        char Operator=sc.next().charAt(0);
        switch(Operator)
        {
            case '+':
                System.out.println("Sum is:"+ (num1+num2));
                break;
            case '-':
                System.out.println("Difference is:"+ (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication is:"+ (num1*num2));
                break;
            case '/':
                System.out.println("Division is:"+ (num1/num2));
                break;
            case '%':
                System.out.println("Modulus is:"+ (num1%num2));
                break; 
            default:
                System.out.println("Invalid operator");
        }
    }
}