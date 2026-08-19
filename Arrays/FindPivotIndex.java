public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 7, 3, 6, 5, 7, 10 };
        int index = pivotIndex(arr);
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
}
