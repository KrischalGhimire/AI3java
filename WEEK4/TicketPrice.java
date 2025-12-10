package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class TicketPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicketPrice
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age:");
        String age= sc.next();
        System.out.println("Enter the Language:");
        String Language= sc.nextLine();
        System.out.println("Are you a Student?");
        String Student= sc.next();
        System.out.println("Is there a Festival:");
        String Festival= sc.next();
        double price;
        if(age=="Child")
        {
            price=150;
        }
        if(age=="Adult")
        {
            price=250;
        }
        if(age=="Senior")
        {
            price=200;
        }
        if(age)
    }
}