public class LowerBound {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { -4, -3, 0, 1, 2, 2, 3 };
        int target = 2;
        int ans = getLowerBound(arr, target);
        System.out.println("Lower Bound of " + target + ": " + ans);

        System.out.println();
        System.out.println();
    }

    static int getLowerBound(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int mid = s - ((s - e) / 2);
        int ans = -1;

        while (s <= e) {
            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }

            mid = s - ((s - e) / 2);
        }

        return ans;
    }
}
