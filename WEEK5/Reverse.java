package WEEK5;
import java.util.Scanner;


/**
 * Write a description of class Reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        int Reversenum=0;
        int checkdigit=num;
        int digit;
        do{
            digit=checkdigit%10;
            Reversenum=Reversenum*10+digit;
            checkdigit=checkdigit/10;
        }while(checkdigit!=0);
        if(num==Reversenum){
            System.out.println("The number is a Palindrome");
        }
        else{
            System.out.println("The number is not a Palindrome");
        }
        System.out.println("The reverse number is:" +Reversenum);
    }   
}