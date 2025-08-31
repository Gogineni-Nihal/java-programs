import java.util.*;
public class avverage_of_three_nums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int num1 = sc.nextInt();
         System.out.println("Enter num 2:");
        int num2 = sc.nextInt();
        System.out.println("Enter num 3:");
        int num3 = sc.nextInt();
        double avg = (double)(num1+num2+num3)/3;
        System.out.println("the average of the given three numbers is :"+avg);
        sc.close();
        

    }
}