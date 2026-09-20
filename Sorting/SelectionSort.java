public class SelectionSort {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 5, 60, 11, 1, 7, 8, 45, -7 };
        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
