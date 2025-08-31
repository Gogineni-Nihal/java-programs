import java.util.Scanner;
public class price_after_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  price:");
        double Price = sc.nextDouble();
        System.out.println("Enter the discount percentage:");
        double discount = sc.nextDouble();
        double Price_after_discount = Price - discount * Price / 100;
        System.out.println("The price after a discount of " + discount + "% is: " + Price_after_discount);
        sc.close();
    }
    
}
