/**
 * @Elliot Parker
 * @v1.1.0-2020-07-11
 */
import java.util.*;

public class Bigger
{
    public static void main(String [] words) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float f1 = s.nextFloat();
        float f2 = s.nextFloat();
        if(f2 >= f1*2)
        {
            System.out.println(f2 + " is two or more times bigger than " + f1);
        } else
        {
            System.out.println(f2 + " is not two or more times bigger than " + f1);
        }
    }
}
