public class NumberOfOccurrence {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3 };
        int target = 3;
        int ans = numberOfOccurrence(arr, target);
        System.out.println("Number of occurence of " + target + ": " + ans);

        System.out.println();
        System.out.println();
    }

    static int numberOfOccurrence(int arr[], int target) {
        int n = arr.length;
        int uB = getUpperBound(arr, target);
        int lB = getLowerBound(arr, target);

        return (uB - lB);
    }

    static int getLowerBound(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int mid = s - ((s - e) / 2);
        int ans = n;

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

    static int getUpperBound(int arr[], int target) {
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int mid = s - ((s - e) / 2);
        int ans = n;

        while (s <= e) {
            if (arr[mid] <= target) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }

            mid = s - ((s - e) / 2);
        }

        return ans;
    }
}
