import java.util.*;

public class ReadUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What number: ");
        int x = input.nextInt();
        input.close();
        for (int i = 1; i <= x; i++) {
            if (i % 10 == 0 || i == x) {
                System.out.println(i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
