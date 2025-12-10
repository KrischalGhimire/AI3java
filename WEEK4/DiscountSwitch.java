package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class DiscountSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiscountSwitch
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Marked Price of the item:");
        float MP=sc.nextFloat();
        System.out.println("Enter the Category of the item:");
        char Category=sc.next().charAt(0);
        float SP;
        switch(Category){
            case 'A':
                SP=MP-(MP * 0.6f);
                System.out.println("The Selling price is: "+SP);
                break;
            case 'B':
                SP=MP-(MP * 0.4f); 
                System.out.println("The Selling price is: "+SP);
                break;
            case 'C':
                SP=MP-(MP * 0.2f);   
                System.out.println("The Selling price is: "+SP);
                break;
            case 'D':
                SP=MP-(MP * 0.1f);   
                System.out.println("The Selling price is: "+SP);
                break;
            default:    
                System.out.println("Invalid Category!");
        }
    }
}