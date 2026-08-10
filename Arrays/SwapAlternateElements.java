public class SwapAlternateElements {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("The Original array is:- ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        swapElement(arr);

        System.out.println("The Swaped array is:- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] swapElement(int arr[]) {

        for (int i = 0; i < (arr.length - 1); i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }
}
