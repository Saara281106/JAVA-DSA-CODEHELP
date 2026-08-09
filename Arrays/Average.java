public class Average {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 2, 4, 1, 3 };
        int size = arr.length;
        double sum = 0.00;
        for(int i=0 ; i<size ; i++){
            sum = sum + arr[i];
        }
        double avg = (sum/size);

        System.out.println("Average of the elements of array is: " + avg);

        System.out.println();
    }
}
