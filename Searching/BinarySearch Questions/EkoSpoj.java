public class EkoSpoj {
    public static void main(String[] args) {
        System.out.println();

        int trees[] = { 20, 15, 10, 17 };
        int m = 7;
        int ans = ekoSpoj(trees, m);

        System.out.println("Answer is : " + ans);
        System.out.println();
    }

    static int ekoSpoj(int trees[], int m) {
        int ans = -1;

        int n = trees.length;
        int s = 0;

        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (trees[i] > maxi) {
                maxi = trees[i];
            }
        }

        int e = maxi;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(trees, m, mid)) {
                ans = mid;
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return ans;
    }

    static boolean isValid(int trees[], int m, int mid) {
        long sum = 0;
        for (int i = 0; i < trees.length; i++) {
            long x = trees[i] - mid;
            if (x < 0) {
                continue;
            }
            sum += x;
        }
        if (sum >= m) {
            return true;
        } else {
            return false;
        }

    }
}
