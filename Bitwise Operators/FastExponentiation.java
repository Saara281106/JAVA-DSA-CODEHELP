import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();

        System.out.println("a power b is: " + exponentitaion(a, b));

        sc.close();
        System.out.println();
    }

    static int exponentitaion(int a, int b) {
        int ans = 1;

        while(b>0){
            //Odd -> 
            if((b&1) == 1){
                ans = a*ans ;
            }

            //Even -> 
            //Square the base
            a = a*a;

            //Divide exponent by 2
            b = b>>1;
        }        
        return ans;
    }
}
