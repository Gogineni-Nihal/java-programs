import java.util.*;
public class squares_to_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int square;
        int i =1;
        System.out.println("The squares of numbers from 1 to " + n + " are:");
        do{
            square = i*i;
            System.out.println(square);
            i++;
        }while(i<=n);
        sc.close();
    }
    
}
