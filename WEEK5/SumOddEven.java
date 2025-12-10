package WEEK5;


/**
 * Write a description of class SumOddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOddEven
{
    public static void main(String[]args)
    {
        int odd=0;
        int even=0;
        for(int i=0;i<=10;i++){
            if(i%2==0){
                even+=i;
            }
            else{
                odd+=i;
            }
            
        }
        System.out.println("The sum of even number is: "+even);
        System.out.println("The sum of odd number is: "+odd);
    }
}