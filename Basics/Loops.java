
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Lets do HomeWork Questions of Loop
        Scanner sc = new Scanner(System.in);

        // //Question 1 - print countung from 1 to n
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // for(int i=1 ; i<=n ; i++){
        // System.out.println(i);
        // }

        // Question 2 - print counting from n to 1.
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();
        // for(int i=1 ; i<=n ; i++){
        // System.out.println(n-i+1);
        // }

        // Question 3 - Print 10 multiplies of n
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();

        // for(int i=1 ; i<=10 ; i++){
        // System.out.println(n + " * " + i + " = " + (n*i));
        // }

        // Question 4 - Print your name 100 times
        // for(int i=1 ; i<=100 ; i++){
        // System.out.println("Saara");
        // }

        // Question 5 - Print all prime numbers from 1 to 100
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = i - 1; j >= 2; j--) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(i);
            }
        }

        //Question 6 - Printing all even numbers from 1 to 100
        // for(int i= 2 ; i<=100 ; i=i+2){
        //     System.out.println(i);
        // } 

        //Question 7 - Print the sum of all the numbers from 1 to n
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();

        // int sum = 0;
        // for(int i=0 ; i<=n ; i++){
        //     sum+=i;
        // }
        // System.out.print(sum);

        //Question 8 - Print all the int between 50 to 100 , that are perfectly divisible by 7
        // for(int i=50 ; i<=100 ; i++){
        //     if(i%7 == 0){
        //         System.out.println(i);
        //     }
        // }

        

        sc.close();
    }
}
