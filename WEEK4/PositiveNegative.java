package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class EvenOROdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegative
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num1= sc.nextInt();
        if(num1>0)
        {
            System.out.println("Number is positive");
        }
        else if (num1<0)
        {
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}