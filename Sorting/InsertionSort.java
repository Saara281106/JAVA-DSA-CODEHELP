public class InsertionSort {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 5, 60, 11, 1, 7, 8, 45, -7 };

        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
    }

    static void insertionSort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i <= n - 1; i++) {
            int currentValue = arr[i];
            int previousIndex = i - 1;
            while (previousIndex >= 0 && currentValue < arr[previousIndex]) {
                // shifting
                arr[previousIndex + 1] = arr[previousIndex];
                previousIndex--;

                // khali jagah pe current value ko place krdo
                arr[previousIndex + 1] = currentValue;

            }
        }
    }
}
