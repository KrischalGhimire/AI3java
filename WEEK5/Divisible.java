package WEEK5;


/**
 * Write a description of class Divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisible
{
    public static void main(String[]args){
        for(int i=1;i<=100;i++){
            if(i%9==0 && i%7==0){
                System.out.println(i+" is divisible by both 9 and 7");
                break;
            }
        }
    }
}