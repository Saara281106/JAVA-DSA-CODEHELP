public class BookAllocation {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 10, 20, 30, 40, 50 };
        int k = 2;
        int minPages = bookAllocation(arr, k);
        System.out.println("Minimum of Maximum Pages are: " + minPages);

        System.out.println();
        System.out.println();
    }

    static int bookAllocation(int arr[], int k) {

        int ans = -1;
        int n = arr.length;

        if(k > n){
            return ans;
        }
        int s = 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
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

    static boolean isValid(int arr[], int k, int maxPages) {

        int n = arr.length;
        int studentCount = 1;
        int pages = 0;

        // Loop to traverse pages
        for (int i = 0; i < n; i++) {
            if (pages + arr[i] <= maxPages) {
                pages += arr[i];
            } else {
                studentCount++;
                if (studentCount > k || maxPages < arr[i]) {
                    return false;
                } else {
                    pages = 0;
                    pages = pages + arr[i];
                }
            }
        }
        return true;
    }
}
