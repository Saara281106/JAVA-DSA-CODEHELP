public class PivotIndex {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = {50, 60, 70, 10, 20, 30, 40 };
        int pivot = getPivotIndex(arr);
        System.out.println("Pivot index of rotated array is: " + pivot);

        System.out.println();
        System.out.println();
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
}
