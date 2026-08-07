public class MissingNumber {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 4, 5 };
        int n = 5;
        int ans = 0;
        int count = 1;
        for (int i = 0; i < n-1; i++) {
                ans = ans ^ arr[i];
            }
        while (count != n+1) {
            ans = ans^count;
            count ++;
        }

        System.out.println("Missing Number: " + ans );
    }
}
