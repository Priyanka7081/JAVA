
import java.util.Scanner;


public class division{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter a number :");
            int n = sc.nextInt();
            if(n%5==0){
                System.out.println("number you enter is divisibal by 5");
                System.out.println("good morning");
            }
            else{
                
                System.out.println("not divisibal by 5");
            }
        }


        }

    }
