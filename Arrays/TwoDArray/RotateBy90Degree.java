public class RotateBy90Degree {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateBy90(arr);
    }

    static void rotateBy90(int arr[][]){
        int n = arr.length;
        //Step 1 Find the transpose of array without creating new array
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Step 2 Reverse every row
        for(int i=0 ; i<n ; i++){
            int k=n-1;
            for(int j=0 ; j<=k ; j++){
                int temp = arr[i][j];
                arr [i][j] = arr[i][k];
                arr[i][k] = temp;
                k--;
            }
        }

        //Printing 2D Array
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
