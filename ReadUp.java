/**
 * @Elliot Parker
 * @v1.2.1-2020-07-11
 */
import java.util.*;

public class ReadUp
{
    public static void main(String [] words) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("What number: ");
        int x = s.nextInt();
        for(int i=1;i<=x;i++)
        {
            if(i%10 == 0 || i == x)
            {
                System.out.println(i + " ");
            } else
            {
                System.out.print(i + " ");
            }
        }
    }
}
