import java.util.*;

public class Twice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float f = input.nextFloat();
        input.close();
        System.out.println(f + "*2=" + f * 2);
    }
}
