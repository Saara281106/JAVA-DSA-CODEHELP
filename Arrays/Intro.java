import java.util.Scanner;

public class Intro {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int n = arr.length;
        //Taking input of array elements
        for(int i=0 ; i<=n-1 ; i++){
            System.out.print("Enter " + i + " index number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Array is :-");


        for(int i=0 ; i<=n-1 ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //Sum of elements 
        int sum = 0;
        for(int i=0 ; i<=n-1 ; i++){
            sum += arr[i];
        }
        System.out.println();
        System.out.print("Sum of array elements is: ");
        System.out.println(sum);

        //Multiplication of elements 
        int product = 1;
        for(int i=0 ; i<=n-1 ; i++){
            product *= arr[i];
        }
        System.out.println();
        System.out.print("Product of array elements is: ");
        System.out.println(product);

        //Maximum value
        int max = arr[0];

        for(int i=0 ; i<=n-1 ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("Maximum value of Array: " + max);

        //Minimum value
        int min = arr[0];

        for(int i=0 ; i<=n-1 ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Minimum value of Array: " + min);
        
        sc.close();
    }
}
