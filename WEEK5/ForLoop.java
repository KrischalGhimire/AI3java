package WEEK5;


/**
 * Write a description of class ForLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForLoop
{
    public static void main(String[]args){
        int sum=0;
        for(int i=1;i<=10;++i){
            //System.out.println(i);
            if(i%2==0){
                
                sum+=i;
                System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}