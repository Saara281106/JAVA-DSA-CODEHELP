public class RotiPrataProblem {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Ram Ram ji");

        int arr[] = { 1, 2, 3, 4 };
        int p = 10;
        int ans = rotiPrata(arr, p);

        System.out.println("Minimum time required to cook " + p + " pranthas: " + ans);

        System.out.println();
        System.out.println();
    }

    static int rotiPrata(int arr[], int p) {
        int ans = -1;
        int s = 0;

        // R is last element of array in case if array is sorted otherwise find maxi
        int R = arr[arr.length - 1];
        int e = R * ((p * (p + 1)) / 2);

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(arr, p, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static boolean isValid(int arr[], int p, int mid) {

        int totalPrata = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentCookRank = arr[i];
            int prata = 1;
            int totalTime = 0;

            while ((totalTime + currentCookRank * prata) <= mid) {

                totalTime += currentCookRank * prata;
                prata++;
                totalPrata++;
                if (totalPrata >= p) {
                    return true;
                } 
            }

        }
        return false;
    }
}
