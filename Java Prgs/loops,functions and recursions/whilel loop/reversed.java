import java.util.*;

public class reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int num ;
        System.out.println("The reversed number is:");
        while (n > 0) {
            num=n%10;
            System.out.print(num);
           
            n /= 10;
        }
        sc.close();

    }

} 
