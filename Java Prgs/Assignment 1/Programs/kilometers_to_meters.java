import java.util.Scanner;
public class kilometers_to_meters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers:");
        double kilometers = sc.nextDouble();
        double meters = kilometers * 1000;
        System.out.println(kilometers + " kilometers is equal to " + meters + " meters.");
        sc.close();
    }
}
