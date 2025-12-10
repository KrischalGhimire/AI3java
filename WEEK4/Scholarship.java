package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarship
{
   public static void main(String[]args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the GPA");
        float GPA=sc.nextFloat();
        System.out.println("Enter the Attendence in Percentage:");
        int Attendence=sc.nextInt();
        System.out.println("Enter the Attitude level:");
        int Attitude=sc.nextInt();
        if(GPA>=3.2 && Attendence>80 && Attitude<5)
        {
            System.out.println("The student is eligible for Scholarship");
        }
        else
        {
            System.out.println("The student is not eligible for Scholarship");
        }
   }
}