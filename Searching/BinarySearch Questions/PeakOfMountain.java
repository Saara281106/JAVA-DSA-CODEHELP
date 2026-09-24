public class PeakOfMountain {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 3, 5, 7, 6, 4, 2, 0, -2, -6 };
        int peak = getPeak(arr);
        System.out.println("The peak of the mountain is: " + peak);

        System.out.println();
        System.out.println();
    }

    static int getPeak(int arr[]) {
        int n = arr.length;
        int s = 0, e = n - 1;
        int mid = s + ((e - s) / 2);
        int ans = -1;
        while (s <= e) {
            if (arr[mid] >= arr[mid + 1]) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

            mid = s + ((e - s) / 2);
        }

        return ans;
    }
}
