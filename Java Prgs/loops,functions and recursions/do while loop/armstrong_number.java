import java.util.*;
public class armstrong_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int ams=n;
        int sum=0;
        do{
            int digit = n%10;
            int cube = digit*digit*digit;
            sum+=cube;
            n/=10;
        }while(n!=0);
        if(sum==ams){
            System.out.println("The number "+ams+" is an armstrong number");
        }else{
            System.out.println("The number "+ams+" is not an armstrong number");
        }
        sc.close();
    }
    
}
