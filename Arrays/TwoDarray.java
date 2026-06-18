
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {

        // Printing 2D Array
        int brr[][] = { { 1, 2, 4 },
                { 2, 7, 10 },
                { 6, 1, 3 } };

        int rowLength = brr.length;
        int colLength = brr[0].length;

        for (int i = 0; i <= (rowLength - 1); i++) {
            for (int j = 0; j <= (colLength - 1); j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
        // Taking input for 2D Array
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("Enter value for i=" + i + " and j=" + j + ": ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum is: " + sum);

        System.out.println("---------------------------------");

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum value is: " + max);

        System.out.println("---------------------------------");
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum value is: " + min);

        sc.close();
    }
}
