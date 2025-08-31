import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter intrest:");
        double rate = sc.nextDouble();
        System.out.println("Enter time(in years):");
        double time = sc.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
        sc.close();
    }
}
