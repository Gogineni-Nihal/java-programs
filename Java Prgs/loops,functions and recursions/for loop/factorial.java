import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int fact = 1;
        if (n == 0 || n == 1) {
            System.out.println("The factorial of " + n + " is 1");

        }

        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is :" + fact);
        sc.close();

    }

}
