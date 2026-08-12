public class MissingNumber {
    public static void main(String[] args) {
        System.out.println();

        //Range is 0 to n so n is given below:-
        int n = 10;

        //Find the missing number in the array from the given range 
        int arr[] = { 2, 1, 0, 3, 4, 7, 5, 8, 9, 10 };

        int ans = missingNumber(arr, n);

        System.out.println("The missing number is: " + ans);

        System.out.println();
    }

    static int missingNumber(int arr[], int n) {

        int ans = 0;
        int size = arr.length;

        // XOR of all the elements of the array
        for (int i = 0; i < size; i++) {
            ans = ans ^ arr[i];
        }

        // Then XOR with the range elements ...
        // only one number will left that is missing because rest will cut each other
        for (int count = 0; count <= n; count++) {
            ans = ans ^ count;

        }

        return ans;
    }
}
