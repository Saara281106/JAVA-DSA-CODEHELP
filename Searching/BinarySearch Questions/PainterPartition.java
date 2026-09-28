public class PainterPartition {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 5, 10, 30, 20, 15 };
        int k = 3;
        int ans = painterPartion(arr, k);
        System.out.println("Minimum of Max time taken by painters: " + ans);

        System.out.println();
        System.out.println();
    }

    static int painterPartion(int arr[], int k) {
        int ans = -1;
        int s = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int e = sum;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValid(arr, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static boolean isValid(int arr[], int k, int maxUnits) {

        int painterCount = 1;
        int units = 0;

        for (int i = 0; i < arr.length; i++) {
            if (units + arr[i] <= maxUnits) {
                units += arr[i];
            } else {
                painterCount++;
                if (painterCount > k || arr[i] > maxUnits) {
                    return false;
                } else {
                    units = 0;
                    units += arr[i];
                }
            }
        }

        return true;
    }
}
