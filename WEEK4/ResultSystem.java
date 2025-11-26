package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class ResultSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultSystem
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int percentage=sc.nextInt();
        if((percentage<=100) && (percentage>=90))
        {
            System.out.println("Distinction");
        }
        else if((percentage>=70) && (percentage<90))
        {
            System.out.println("FirstDivision");
        }
        else if((percentage>=50) && (percentage<70))
        {
            System.out.println("SecondDivision");
        }
        else if((percentage<50) && (percentage>=0))
        {
            System.out.println("You have failed");
        }
        else{
            System.out.println("You have entered invalid number");
        }
    }
}