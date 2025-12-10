package WEEK5;
import java.util.Scanner;


/**
 * Write a description of class ResturantManagementSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResturantManagementSystem
{
    public static void main(){
        Scanner sc= new Scanner(System.in);
        int Choice;
        int Quantity;
        int totalBill=0;
        do
        {
            System.out.println("Resturant Menu"+"\n"+"0: Bill"+"\n"+"1: Pizza Rs 500"+"\n"+"2: Momo Rs 300");        
            System.out.println("Enter your choice:");
            Choice=sc.nextInt();
            switch(Choice){
                case 1:System.out.println("You have ordered pizza");
                        System.out.println("Enter the quantity:");
                        Quantity=sc.nextInt();
                        totalBill+=Quantity*500;
                        break;
                case 2:System.out.println("You have ordered Momo");
                        System.out.println("Enter the quantity:");
                        Quantity=sc.nextInt();
                        totalBill+=Quantity*300;
                        break;
                case 0:System.out.println("The bill is :"+totalBill);
                        break;
                default: System.out.println("Please try again! ");       
            }
        }while(Choice!=0);
    }
}