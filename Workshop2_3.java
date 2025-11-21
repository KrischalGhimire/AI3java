
/**
 * Write a description of class Workshop2_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Workshop2_3
{
    public static void main(String[]args)
    {
        //Question 6
        var WaterLevel=1000;//Initializing variable with water level
        System.out.println("The Water level in tank is: "+WaterLevel);
        var bigger=(WaterLevel>=1000)?"Warning:Water level has reached 1000 or more!": "Status: Normal";//Using ternary operator to determine water level and display warning if necessary 
        System.out.println(bigger);//Displaying message
        
        
    }
}