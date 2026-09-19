public class SpiralPrint {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int ans[] = spiralPrint(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    static int[] spiralPrint(int arr[][]) {
        int n = arr.length;
        int m = arr[1].length;
        int ans[] = new int[n * m];
        int k = 0;

        int startingRow = 0;
        int endingRow = n - 1;
        int startingCol = 0;
        int endingCol = m - 1;

        while ((startingRow <= endingRow) && (startingCol <= endingCol)) {
            // Loop 1 - Left to Right
            for (int i = startingCol; i <= endingCol; i++) {
                ans[k] = arr[startingRow][i];
                k++;
            }
            startingRow++;

            // Loop 2 - Top to bottom
            for (int i = startingRow; i <= endingRow; i++) {
                ans[k] = arr[i][endingCol];
                k++;
            }
            endingCol--;

            if (startingRow <= endingRow) {
                // Loop 3 - Right to Left
                for (int i = endingCol; i >= startingCol; i--) {
                    ans[k] = arr[endingRow][i];
                    k++;
                }
                endingRow--;
            }

            if (startingCol <= endingCol) {
                // Loop 4 - Bottom to Top
                for (int i = endingRow; i >= startingRow; i--) {
                    ans[k] = arr[i][startingCol];
                    k++;
                }
                startingCol++;
            }
        }

        return ans;
    }
}
