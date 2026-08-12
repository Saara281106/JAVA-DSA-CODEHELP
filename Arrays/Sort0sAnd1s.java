public class Sort0sAnd1s {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 0, 1, 1, 0, 0, 1 };
        int ans[] = optimalSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

        System.out.println();
    }

    static int[] sorting(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];

        // Adding all 0s to new array first
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                ans[k] = arr[i];
                k++;
            }
        }

        // Adding all 1s in remaining space
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                ans[k] = arr[i];
                k++;
            }
        }

        return ans;
    }

    static int[] optimalSort(int arr[]) {
        int n = arr.length;

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                if (arr[i] == 0) {
                    i++;
                }
                if (arr[j] == 1) {
                    j--;
                }
            }

        }

        return arr;
    }
}
