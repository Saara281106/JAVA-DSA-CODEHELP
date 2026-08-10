public class AlternateExtremeElements {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        extremeElements(arr);

        System.out.println();
    }

    static void extremeElements(int arr[]) {
        int n = arr.length;
        int i = 0;
        while (i < n - 1) {
            System.out.print(arr[i] + " " + arr[n - 1] + " ");
            i++;
            n--;
        }

        if (i == n - 1) {
            System.out.print(arr[i] + " ");
        }
    }
}
