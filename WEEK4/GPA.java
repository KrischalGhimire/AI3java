package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class GPA here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPA
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your GPA");
        float GPA=sc.nextFloat();
        if(GPA>3.6 && GPA<=4.0)
        {
            System.out.println("Your Grade is A+");
        }
        else if(GPA>3.2 && GPA<=2.8)
        {
            System.out.println("Your Grade is A");
        }
        else if(GPA>2.8 && GPA<=3.2)
        {
            System.out.println("Your Grade is B+");
        }
        else if(GPA>2.4 && GPA<=2.8)
        {
            System.out.println("Your Grade is B");
        }
        else if(GPA>2.0 && GPA<=2.8)
        {
            System.out.println("Your Grade is C+");
        }
        else if(GPA>1.6 && GPA<=2.0)
        {
            System.out.println("Your Grade is C");
        }
        else if(GPA>1.2 && GPA<=1.6)
        {
            System.out.println("Your Grade is D+");
        }
        else if(GPA>=0.8 && GPA<=1.2)
        {
            System.out.println("Your Grade is D");
        }
        else if(GPA<0.8 && GPA>=0.0)
        {
            System.out.println("You have Failed the exam");
        }
        else
        {
            System.out.println("Invalid Input!");    
        }
    }
}