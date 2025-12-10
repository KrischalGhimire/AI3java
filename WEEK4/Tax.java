package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class Tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tax
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your income:");
        double income=sc.nextDouble();
        double tax;
        if(income<500000)
        {
            tax=income*0.01f;
        }
        else if(income>500000 && income<=700000)
        {
            tax=(0.1f*(income-500000))+5000;
        }
        else if(income>700000 && income<=1000000)
        {
            tax=(0.2f*(income-700000))+20000+5000;
        }
        else if(income>1000000 && income<=2000000)
        {
            tax=(0.3f*(income-100000))+5000+20000+60000;
        }
        else if(income>2000000 && income<=5000000)
        {
            tax=(0.36f*(income-2000000))+5000+20000+60000+300000;
        }
        else if(income>5000000)
        {
            tax=(0.39f*(income-5000000))+5000+20000+60000+300000+1080000;
        }
    }    
}