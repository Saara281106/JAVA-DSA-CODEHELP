public class BinarySearch {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 10, 20, 30, 31, 32, 33, 41, 42, 50, 60, 70, 80, 90 };
        int target = 32;
        int ans = binarySearch(arr, target);
        System.out.println("The target element is at index: " + ans);

        System.out.println();
        System.out.println();
    }

    static int binarySearch(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid = start - ((start - end) / 2);

        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = start - ((start - end) / 2);
        }

        return -1;
    }
}
