import java.util.Scanner;
public class bmi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kg:");    
        double weight = sc.nextDouble();
        System.out.println("Enter height in meters:");    
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
        sc.close();
    }
    
}
