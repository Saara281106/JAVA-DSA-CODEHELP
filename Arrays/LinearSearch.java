import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int arr[] = { 2, 5, 3, 1, 7};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();

        if(linearSearch(arr, target)){
            System.out.println("Yes , given value is present");
        } else{
            System.out.println("No , given value is not present");
        }
        

        sc.close();
    }

    static boolean linearSearch(int arr[] , int target){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
