package WEEK5;


/**
 * Write a description of class Skip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Skip
{
    public static void main(String[]args){
        for(int i=1;i<=100;i++){
            if(i%2==0){
                continue;    
            }
            System.out.println(i);
            if(i%13==0){
                break;   
            }
        }
    }
}