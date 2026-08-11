public class ReverseArray {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 2, 4, 6, 8, 9 };

        System.out.println("Original Array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        reverse(arr);

        System.out.println("Reversed Array!");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static void reverse(int arr[]) {

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}
