public class BubbleSort {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 5, 60, 11, 1, 7, 8, 45, -7 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
    }

    static void bubbleSort(int arr[]) {

        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
