import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter first number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter second number: ");
        // int b = sc.nextInt();
        // int solution = a + b;
        // System.out.println("Sum of the numbers is: " + solution);

        System.out.print("Enter flag value: ");
        boolean flag = sc.nextBoolean();
        System.out.println("You entered: " + flag);



        sc.close();
    }
}
