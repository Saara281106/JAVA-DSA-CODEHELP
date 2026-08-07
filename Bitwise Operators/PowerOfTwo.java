import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if (BetterMenthod(a)) {
            System.out.println("Yes, It's Power of 2");
        } else {
            System.out.println("No, It's not Power of 2");
        }

        sc.close();
        System.out.println();
    }

    static boolean checkPowerOfTwo(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }

    static boolean BetterMenthod(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
