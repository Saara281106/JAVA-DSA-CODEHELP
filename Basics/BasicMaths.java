public class BasicMaths {

    //Question 1 - Print digits
    static void printDigitd(int n){
        while(n!=0){
            int digit = n%10;
            System.out.println(digit);
            n/=10;
        }
    }

    //Question 2 - Count Digits
    static void countDigits(int n){
        int count = 0;
        while(n!=0){
            int digit = n%10;
            count ++;
            n/=10;
        }
        System.out.println("Number of digits are: " + count);

    }

    //Question 3
    static void sumDigits(int n){
        int sum = 0;
        while(n!=0){
            int digits = n%10;
            sum += digits;
            n /=10;
        }
        System.out.println("Sum of digits is: " + sum);
    }

    //Question 4
    static int printReverse(int n){
        int ans = 0;
        while(n!=0){
            int digit = n%10;
            ans = (ans*10) + digit;
            n/=10;
        }
        return ans;
    }

    //Question 5 - Check Palindrome
    static boolean isPalindrome(int n){
        int original = n;
        int reversed = printReverse(n);
        if(original == reversed){
            return true;
        }
        else{
            return false;
        }
    }

    //Question 6 - Check prime
    static boolean isPrime(int n){
        for(int i=2 ; i*i<=n ; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    //Question 7 - GCD
    static int getGCD(int a , int b){
        while(b!=0){
            int oldB = b;
            b = a%b;
            a = oldB;
        }
        int ans = a;
        return ans;
    }

    //Question 8 - LCM
    static int getLCM(int a , int b){
        int ans = (a*b) / getGCD(a,b);
        return ans;
    }

    //Question 9 - Check Armstrong Number
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n!=0){
            int digit = n%10;
            int cube = digit*digit*digit;
            sum = sum + cube;

            n/=10;
        }
        if(sum == original){
            return true;
        }
        else{
            return false;
        }
    }

    //Question 10 - Check perfect number
    static boolean isPerfect(int n){
        int sum = 1;
        for(int i=2 ; i*i<=n ; i++){
            if(n%i == 0){
                sum = sum + i + (n/i);
            }
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){

        // System.out.println("--------------------------");
        // int n = 18;
        // printDigitd(n);
        // System.out.println("--------------------------");
        // countDigits(n);
        // System.out.println("--------------------------");
        // sumDigits(n);
        // System.out.println("--------------------------");
        // int ans = printReverse(n);
        // System.out.println("Reversed number is: " + ans);
        // System.out.println("--------------------------");
        // if(isPalindrome(n)){
        //     System.out.println("Yes, n is palindrome!");
        // }
        // else{
        //     System.out.println("No, n is not palindrome.");
        // }
        // System.out.println("--------------------------");
        // if(isPrime(n)){
        //     System.out.println("Yes, its a prime number!");
        // }
        // else{
        //     System.out.println("No, its not a prime number.");
        // }
        // System.out.println("--------------------------");


        // int gcd = getGCD(18,12);
        // System.out.println("GCD is: " + gcd ); 

        // int lcm = getLCM(12,18);
        // System.out.println("GCD is: " + lcm ); 

        // if(isArmstrong(153)){
        //     System.out.println("Yes its an Armstrong Number");
        // }
        // else{
        //     System.out.println("No, its not an Armstrong number.");
        // }

        if(isPerfect(6)){
            System.out.println("PERFECT NUMBER!!");
        }
        else{
            System.out.println("Not a Perfecr number");
        }

    }
}
