package WEEK5;


/**
 * Write a description of class Pattern here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pattern
{
    public static void main(String[]args){
        for(int i=5;i>0;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }    
    }
}