package Week3;
import java.util.Scanner;


/**
 * Write a description of class Year here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Year
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter day you want to convert:");
        var Inputday=sc.nextInt();
        int year=Inputday/360;
        int months=(Inputday%360<0)?0:(Inputday%360)/30;
        int days=(Inputday%360)%30;
        System.out.println("Year:"+year+"\n"+"months:"+months+"\n"+"days:"+days);
    }
}