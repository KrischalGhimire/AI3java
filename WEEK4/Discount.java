package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class Discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Discount
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Marked Price of the item:");
        float MP=sc.nextFloat();
        System.out.println("Enter the Category of the item:");
        char Category=sc.next().charAt(0);
        float SP;
        if(Category=='A')
        {
         SP=MP-(MP * 0.6f);
         System.out.println("The Selling price is: "+SP);
        }
        else if(Category=='B')
        {
         SP=MP-(MP * 0.4f); 
         System.out.println("The Selling price is: "+SP);
        }
        else if(Category=='C')
        {
         SP=MP-(MP * 0.2f);   
         System.out.println("The Selling price is: "+SP);
        }
        else if(Category=='D')
        {
         SP=MP-(MP * 0.1f);   
         System.out.println("The Selling price is: "+SP);
        }
        else
        {
            System.out.println("Invalid Category!");
        }
        
    }
}