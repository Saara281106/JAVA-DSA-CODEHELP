public class UnionOfArray {
    public static void main(String[] args) {
        System.out.println();

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 4, 5, 6, 7, 8 };

        union(arr1, arr2);

        System.out.println();
    }

    static void union(int arr1[], int arr2[]) {

        int n = arr1.length + arr2.length;
        int union[] = new int[n];

        // Array 1 elements are going to be added in the array as it is
        for (int i = 0; i < arr1.length; i++) {
            union[i] = arr1[i];
        }

        int k = arr1.length;

        // Now check each element of array 2 if it is present in union if no then
        // union[k] = arr2[i]

        for (int i = 0; i < arr2.length; i++) {
            boolean isPresent = false;
            for (int j = 0; j < k; j++) {
                if (arr2[i] == union[j]) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                union[k] = arr2[i];
                k++;
            }

        }

        // Printing Union
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
