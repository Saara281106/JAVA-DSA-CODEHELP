public class ThreeSum {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 10, 20, 45, 100, -2, -3, -4, -5 };
        int target = 28;

        int ans[] = findThreeSum(arr, target);

        System.out.println("Num1 = " + ans[0] + " , Num2 = " + ans[1] + " , num3 = " + ans[2]);

        System.out.println();

    }

    static int[] findThreeSum(int arr[], int target) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        num1 = arr[i];
                        num2 = arr[j];
                        num3 = arr[k];
                        break;
                    }
                }
            }
        }
        int ans[] = { num1, num2, num3 };
        return ans;
    }
}
