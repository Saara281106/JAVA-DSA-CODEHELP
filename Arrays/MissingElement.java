public class MissingElement {
    public static void main(String[] args) {

        int arr[] = { 1, 4, 4, 5, 2, 2 };
        int ans[] = missingElements(arr);
        for (int i : ans) {
            System.out.println("Missing element: " + i);
        }

    }

    static int[] missingElements(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            int position = value - 1;
            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        int ans[] = new int[count];

        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans[k] = i + 1;
                k++;
            }
        }

        return ans;
    }
}