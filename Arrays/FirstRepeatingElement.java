public class FirstRepeatingElement {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 2, 2, 3, 4, 4, 5, 5, 5, 6 };
        findFirstRepeating(arr);

        System.out.println();
    }

    static void findFirstRepeating(int arr[]){
        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("The first repeating value is: " + arr[i]);
                break;
            }
        }
    }
}
