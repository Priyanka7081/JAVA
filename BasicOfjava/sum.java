
import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter first number :");
        int x = sc.nextInt();
        System.err.println("Enter second number :");
        int y = sc.nextInt();
        int sum = x+y;

        System.out.println("the sum is : "+sum);
    }
}