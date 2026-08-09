public class MultiplyByTen {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 2, 3, 5, 9, 12 };
        int size = arr.length;

        int solution[] = multuplyBy10(arr, size);

        for (int i : solution) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static int[] multuplyBy10(int arr[], int size) {
        int newArray[] = new int[size];
        for (int i = 0; i < size; i++) {
            int element = arr[i];
            element = element * 10;
            newArray[i] = element;
        }
        return newArray;
    }

    static void multiplyTen(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i] * 10;
            System.out.print(arr[i] + " ");
        }
    }
}
