import java.util.Scanner;
public class pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks(min =0 max =100):");
        int marks = sc.nextInt();
        if (marks >= 40) {
            System.out.println("You have passed.");
        } else {
            System.out.println("You have failed.");
        }
        sc.close();
    }
    
}
