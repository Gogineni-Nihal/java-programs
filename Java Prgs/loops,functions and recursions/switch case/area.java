import java.util.*;
public class area {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the option :");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        double pi = 3.14;
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter radius of the circle:");
                double radius = sc.nextDouble();
                double circleArea = pi * radius * radius;
                System.out.println("Area of the circle: " + circleArea);
                break;
            case 2:
                System.out.println("Enter length and breadth of the rectangle:");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;
            case 3:
                System.out.println("Enter base and height of the triangle:");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of the triangle: " + triangleArea);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
    
}
