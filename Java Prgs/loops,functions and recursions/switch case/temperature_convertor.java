import java.util.*;
public class temperature_convertor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 celcius to fahrenheit");
        System.out.println("2 fahrenheit to celcius");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter temperature in Celsius:");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit:");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }
}
