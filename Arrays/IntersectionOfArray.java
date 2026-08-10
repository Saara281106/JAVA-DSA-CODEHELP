public class IntersectionOfArray {
    public static void main(String[] args) {
        System.out.println();

        // Array 1
        int arr1[] = { 3, 4, 5, 6 };
        int arr2[] = { 1, 2, 3, 4, 5, 6 };

        intersection(arr1, arr2);

        System.out.println();
    }

    static void intersection(int arr1[], int arr2[]) {

        int m = 0;
        if (arr1.length > arr2.length) {
            m = arr2.length;
        } else {
            m = arr1.length;
        }

        int ans[] = new int[m];

        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    ans[k] = arr1[i];
                    k++;
                }
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}
