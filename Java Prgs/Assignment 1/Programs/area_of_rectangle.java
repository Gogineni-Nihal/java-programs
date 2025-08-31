import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter breadth of rectangle:");
        int breadth = sc.nextInt();
        int area = length * breadth;
        System.out.println("The area of the rectangle is: " + area);
        sc.close();
    }
}
