public class AggressiveCows {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 2, 4, 8, 9 };
        int k = 3;
        int ans = aggressiveCows(arr, k);
        System.out.println("The maximum of possible minimum distance is: " + ans);

        System.out.println();
        System.out.println();
    }

    static int aggressiveCows(int arr[], int k) {
        int ans = -1;
        int s = 0;
        int e = arr[arr.length - 1] - arr[0];

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValid(arr, k, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    static boolean isValid(int arr[], int k, int minDistance) {

        return true;
    }
}
