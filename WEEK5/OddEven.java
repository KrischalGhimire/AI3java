package WEEK5;
import java.util.Scanner;


/**
 * Write a description of class OddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddEven
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        int checkdigit=num;
        int even=0;
        int odd=0;
        int single;
        do{
            single=checkdigit%10;
            if(single%2==0 ){
                even+=1;
            }
            else{
                odd+=1;
            }
            checkdigit=checkdigit/10;
        }while(checkdigit!=0);
        System.out.println("The number of even digit is:" +even);
        System.out.println("The number of odd digit is:" +odd);
    }
}