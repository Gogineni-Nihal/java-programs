import java.util.*;
public class multiplication_table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number :");
        int n = sc.nextInt();
        int result;
        for(int i=0;i<=10;i++){
            result=n*i;
            System.out.println(n +"x"+ i +"="+ result);

        }
        sc.close();


    }
    
}
