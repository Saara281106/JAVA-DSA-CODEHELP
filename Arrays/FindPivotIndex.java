public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 7, 3, 6, 5, 7, 10 };
        int index = optimizedSol(arr);
        System.out.println("The pivot index is: " + index);

        System.out.println();
    }

    static int pivotIndex(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = i - 1; j >= 0; j--) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    static int optimizedSol(int arr[]) {
        int n = arr.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = arr[0];
        for(int i=1 ; i<n ; i++){
            leftSum[i] = leftSum[i-1] + arr[i];
        }

        rightSum[n-1] = arr[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rightSum[i] = rightSum[i+1] + arr[i];
        }
    
        for(int i=0 ; i<n ; i++){
            if(rightSum[i] == leftSum[i]){
                return i;
            }
        }

        return -1;
    }
}
