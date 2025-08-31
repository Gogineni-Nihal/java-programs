import java.util.Scanner;
public class cube_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int cube = number * number * number;
        System.out.println("The cube of " + number + " is " + cube);
        sc.close();
    }
    
}
