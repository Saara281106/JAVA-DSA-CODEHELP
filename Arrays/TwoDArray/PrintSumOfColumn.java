public class PrintSumOfColumn {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 1 }, { 4, 5, 6, 1 }, { 7, 8, 9, 1 } };
        int sum[] = printSumOfRow(arr);
        for (int i : sum) {
            System.out.print(i + " ");
        }
    }

    static int[] printSumOfRow(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        //Ans array ki length ab no. of elements in a column jitni hogi 
        int ans[] = new int[m];

        int k = 0;
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            ans[k] = sum;
            k++;
        }

        return ans;
    }
}
