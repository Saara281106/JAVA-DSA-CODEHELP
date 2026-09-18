public class PrintSumOfColumn {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sum[] = printSumOfRow(arr);
        for (int i : sum) {
            System.out.print(i + " ");
        }
    }

    static int[] printSumOfRow(int arr[][]) {
        int n = arr.length;
        int ans[] = new int[n];

        int k = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int m = arr[i].length;
            for (int j = 0; j < m; j++) {
                sum += arr[j][i];
            }
            ans[k] = sum;
            k++;
        }
 
        return ans;
    }
}

