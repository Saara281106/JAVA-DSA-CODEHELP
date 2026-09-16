public class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println();
        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int ans = maxSubarray(arr);
        System.out.println("The maximum value of sum of subarray is: " + ans);
        System.out.println();
    }

    static int maxSubarray(int arr[]) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Step 1: Update Sum
            sum += arr[i];
            // Step 2: Compare with maxi
            if(sum>maxi){
                maxi = sum;
            }
            // Step 3: Check sum if negetive value exist update sum to 0
            if(sum<0){
                sum = 0;
            }
        }

        return maxi;
    }
}
