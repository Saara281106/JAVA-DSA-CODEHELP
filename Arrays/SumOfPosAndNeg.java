public class SumOfPosAndNeg {
    public static void main(String[] args) {

        // Find the sum of POSITIVE numbers and NEGETIVE numbers

        int arr[] = { 2, -3, -1, 4, 6, -9 };
        printSum(arr);
    }

    static void printSum(int arr[]){
        int posSum = 0;
        int negSum = 0;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>=0){
                posSum = posSum + arr[i];
            } else{
                negSum = negSum + arr[i];
            }
        }

        System.out.println("Sum of Positive elements is: " + posSum);
        System.out.println("Sum of Negetive elements is: " + negSum);
    }
}
