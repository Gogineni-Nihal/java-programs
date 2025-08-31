import java.util.*;

public class read_zero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Enter a number:");
            num = sc.nextInt();
            if(num==0){
                break;
            }

        }while(num!=0);

    sc.close();
   }
}
