package WEEK5;


/**
 * Write a description of class MultipleTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultipleTable
{
    public static void main(String[]args){
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}