public class TransposeOfMatrix {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

        int n = arr.length;
        int m = arr[1].length;

        int ans[][] = transpose(arr);

        // pehle jo length column ki transpose mein row ki hai ans pehle jp length row
        // ki thi ab column ki hai
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] transpose(int arr[][]) {
        int n = arr.length;
        int m = arr[1].length;
        //original array n*m
        //transpose array m*n
        int ans[][] = new int[m][n];
        // Step 1 is row vise triverse kro
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                // Step 2 column vise put the value in new array
                ans[col][row] = arr[row][col];
            }
        }

        return ans;
    }
}
