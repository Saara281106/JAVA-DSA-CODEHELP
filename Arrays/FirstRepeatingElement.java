public class FirstRepeatingElement {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 2, 3, 4, 5, 5, 5, 6, 1 };
        firstRepeating(arr);

        System.out.println();
    }

    // if the array is sorted
    static void findFirstRepeating(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("The first repeating value is: " + arr[i]);
                break;
            }
        }
    }

    // if the array is unsorted
    static void firstRepeating(int arr[]) {
        int n = arr.length;
        boolean found = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("The first repeating value is: " + arr[j]);
                    found = true;
                    break;
                }
            }
            if (found == true) {
                break;
            }
        }
    }
}
