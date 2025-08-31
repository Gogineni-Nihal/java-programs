import java.util.*;
public class sum_of_odds{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        do{
            if(i % 2 != 0){
                sum += i;
            }
            i++;
        }while(i <= n);
        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}