import java.util.*;
public class sum_of_two_nums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1 = sc.nextInt();
         System.out.println("Enter num 2:");
        int num2 = sc.nextInt();
        int num3= num1+num2;
        System.out.println("The sum of two given numbers is:"+num3);
        sc.close();

    }
}