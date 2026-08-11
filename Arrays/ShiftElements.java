public class ShiftElements {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int k = 1;

        System.out.println("Original Array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        shift(arr, k);

        System.out.println("Right Shifted Array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static void shift(int arr[], int k) {

        for (int x = 1; x <= k; x++) {
            int i = arr.length - 1;
            int temp = arr[arr.length - 1];

            while (i > 0) {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[0] = temp;
        }

    }
}
