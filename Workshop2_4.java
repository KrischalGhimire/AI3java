import java.util.Scanner;

/**
 * Write a description of class Workshop2_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop2_4
{
    public static void main(String[]args)
    {
        //Question 7
        Scanner sc=new Scanner(System.in);
        System.out.println("For Pharmacist:");
        System.out.println("Please enter the name of the medicine you want: ");
        String MedicineName=sc.nextLine();//Taking input for name for the medicine
        System.out.println("Please enter the quantity of the medicine you want: ");
        int MedicineQuantity=sc.nextInt();//Taking input for quantity of the medicine
        System.out.println("Please enter the price of the medicine you want to label: ");
        float MedicinePrice=sc.nextFloat();//Taking input for price of the medicine
        
        System.out.println("For Customer:");
        System.out.println("Please enter the name of the medicine you want: ");
        String CustomerMedicine=sc.next();//Taking input for name of the medicine that customer need
        System.out.println("Please enter the quantity of the medicine you want: ");
        int CustomerQuantity=sc.nextInt();//Taking input for quantity of the medicine that customer need
        float TotalPrice=CustomerQuantity*MedicinePrice;//Calculating the total price of medicine purchased by the customer
        System.out.println("The total price for your medicine is: "+TotalPrice);
        int RemainingQuantity=MedicineQuantity-CustomerQuantity;//Calculating the remaining quatity of the medice that the pharmacist has
        System.out.println("The total quantity remaining for your medicine is: "+RemainingQuantity);
        sc.close();
    }    
}