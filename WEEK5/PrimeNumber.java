package WEEK5;
import java.util.Scanner;


/**
 * Write a description of class PrimeNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeNumber
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        boolean prime; 
        for(int i=1;i<=num;i++){
            if(num%i==0 && i!=1  && i!=num){
                prime=false;
            }
            else{
                prime=true;
            }
        }
        if(prime=true){
            System.out.println("Number is  prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }   
}