import java.util.*;

public class Bigger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        float f1 = input.nextFloat();
        float f2 = input.nextFloat();
        input.close();
        if (f2 >= f1 * 2) {
            System.out.println(f2 + " is two or more times bigger than " + f1);
        } else {
            System.out.println(f2 + " is not two or more times bigger than " + f1);
        }
    }
}
