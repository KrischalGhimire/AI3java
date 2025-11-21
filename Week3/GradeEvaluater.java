package Week3;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluater
{
    public static void main(String[]args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your grade");
     int grade=sc.nextInt();
     String Result=(grade>=40)?"Pass":"Fail";
     System.out.println("Your result is:"+"\n"+Result);
    }
}