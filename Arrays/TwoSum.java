public class TwoSum {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 10, 20, 45, 100, -2, -3, -4, -5 };
        int target = 145;

        int ans[] = findTwoSum(arr, target);

        System.out.println("Num1 = " + ans[0] + " & Num2 = " + ans[1]);

        System.out.println();

    }

    static int[] findTwoSum(int arr[], int target) {

        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    num1 = arr[i];
                    num2 = arr[j];
                    break;
                }
            }
        }
        int ans[] = { num1, num2 };
        return ans;
    }
}
