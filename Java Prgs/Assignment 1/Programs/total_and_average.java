import java.util.Scanner;
public class total_and_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for subject 1:");
        int sub1 = sc.nextInt();
        System.out.println("Enter marks for subject 2:");
        int sub2 = sc.nextInt();
        System.out.println("Enter marks for subject 3:");
        int sub3 = sc.nextInt();
        System.out.println("Enter marks for subject 4:");
        int sub4 = sc.nextInt();
        System.out.println("Enter marks for subject 5:");
        int sub5 = sc.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = (double)(total / 5.0);
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        sc.close();

        
    }
    
}
