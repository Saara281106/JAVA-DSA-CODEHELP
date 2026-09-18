public class WavePrintOfMatrix {
    public static void main(String[] args) {
        System.out.println();

        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        wavePrint(arr);

        System.out.println();
    }

    static void wavePrint(int arr[][]) {
        int rowLength = arr.length;
        int colLength = arr[1].length;
        // Outer Loop is for column arr[row][col]
        for (int col = 0; col < colLength; col++) {

            if ((col & 1) == 0) {
                for (int row = 0; row < rowLength; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = rowLength - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }

        }
    }
}
