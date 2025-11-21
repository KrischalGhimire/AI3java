package Week3;
import java.util.Scanner;


/**
 * Write a description of class Clock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Clock
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter seconds you want to convert:");
        var InputSeconds=sc.nextInt();
        int hours=InputSeconds/3600;
        int minutes=(InputSeconds%3600<0)?0:(InputSeconds%3600)/60;
        var seconds=(InputSeconds%3600)%60;
        System.out.println("Hours:"+hours+"\n"+"minutes:"+minutes+"\n"+"seconds:"+seconds);
    }
}