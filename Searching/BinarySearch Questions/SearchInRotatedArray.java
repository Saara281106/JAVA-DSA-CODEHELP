public class SearchInRotatedArray {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 50, 60, 70, 10, 20, 30, 40 };
        int target = 40;

        int n = arr.length;

        if (arr[0] < arr[n - 1]) {
            System.out.println("Array is not rotated mere saath khel mat khelo");
        } else {
            int index = search(arr, target);
            System.out.println("The target is present at index: " + index);

        }

        System.out.println();
        System.out.println();
    }

    static int search(int arr[], int target) {
        int ans = -1;
        int n = arr.length;
        int pivot = getPivotIndex(arr);

        if (target <= arr[n - 1]) {
            // search in right part

            ans = binarySearch(arr, target, pivot + 1, n - 1);

        } else {
            // search in left part

            ans = binarySearch(arr, target, 0, pivot);
        }

        return ans;
    }

    static int getPivotIndex(int arr[]) {
        int n = arr.length;
        int s = 0, e = n - 1;
        int mid = s + ((e - s) / 2);
        int ans = -1;

        while (s <= e) {
            if (arr[mid] <= arr[n - 1]) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }

            mid = s + ((e - s) / 2);
        }

        return ans;
    }

    static int binarySearch(int arr[], int target, int s, int e) {
        int mid = s + ((e - s) / 2);
        while (s <= e) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }

            mid = s + ((e - s) / 2);
        }
        return -1;
    }
}
