import java.util.*;
public class perimeter_of_square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square:");    
        int side = sc.nextInt();
        int perimeter = 4 * side;
        System.out.println("The perimeter of the square is: " + perimeter);
        sc.close();

    }
     
}
