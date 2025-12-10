package WEEK4;
import java.util.Scanner;


/**
 * Write a description of class PaperSizes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PaperSizes
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Paper Size:");
        String Paper=sc.next();
        String dimension;
        switch(Paper){
            case "A0":
                dimension="841 X 1189 mm(33.1 x 46.8 inches)";
                System.out.println("The Dimension of "+Paper+" is: "+dimension);
                break;
            case "A1":
                dimension="594 x 841 mm (23.4 x 33.1 inches)";
                System.out.println("The Dimension of "+Paper+" is: "+dimension);
                break;
            case "A2":
                dimension="420 x 594 mm (16.5 x 23.4 inches)";
                System.out.println("The Dimension of "+Paper+" is: "+dimension);
                break;
            case "A3":
                dimension="297 x 420 mm (11.7 x 16.5 inches)";
                System.out.println("The Dimension of "+Paper+" is: "+dimension);
                break;
            case "A4":
                dimension="210 x 297 mm (8.3 x 11.7 inches)";
                System.out.println("The Dimension of "+Paper+" is: "+dimension);
                break; 
            case "A5":
                dimension=": 148 x 210 mm (5.8 x 8.3 inches)";
                System.out.println("The Dimension of "+Paper+" is: "+dimension);
                break;    
            default:    
                System.out.println("Invalid Category!");
            }    
    }
}