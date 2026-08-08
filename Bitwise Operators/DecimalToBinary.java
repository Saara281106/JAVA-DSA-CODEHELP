import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println();

        // Convert Decimal to Binary
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to want in Binary: ");
        int n = sc.nextInt();

        String ans = decimalToBinary(n);
        System.out.println("Binary number is: " + ans);

        sc.close();
        System.out.println();
    }

    static String decimalToBinary(int n) {

        String ans = "";

        //it will give the reversed binary string.... so we have to reverse it
        String x = "";
        int digit = 0;
        while( n!=0){
            digit = n%2;
            n=n/2;
            x = x + digit;
        }

        //Reverse the digits of x
        ans = printReverse(x);

        return ans;
    }
    static String printReverse(String s){
        String ans = "";
        for (int i = (s.length() - 1); i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        return ans;
    }
}
