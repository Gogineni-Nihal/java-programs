import java.util.*;
public class squareOfSameNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  no of rows :");
        int rows = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=3;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
