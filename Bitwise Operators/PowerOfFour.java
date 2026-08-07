import java.util.Scanner;

public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        if (checkPowerOfFour(a)) {
            System.out.println("Yes, It's Power of 4");
        } else {
            System.out.println("No, It's not Power of 4");
        }

        sc.close();
        System.out.println();
    }

    static boolean checkPowerOfFour(int n) {
        int count = 0;
        int num = n;
        while (num != 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        if (count == 1) {
            //Only 1 set bit is present
            while(n!=0){
                if((n&1) == 1 ){
                    return true;
                }
                n = n >> 2;
            }
        }
        return false;
    }

    // static boolean BetterMenthod(int n) {
    //     if ((n & (n - 1)) == 0) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }
}
