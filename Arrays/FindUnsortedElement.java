public class FindUnsortedElement {
    public static void main(String[] args) {

        // Find the first unsorted elements in the array
        int arr[] = { 2, 3, 9, 11, 13 , 45 , 3 };
        int ans = unsortedElement(arr);

        System.out.println("Unsorted Element: " + ans);
    }

    static int unsortedElement(int arr[]){
        for(int i=0 ; i<(arr.length - 1) ; i++){
            if(arr[i] >= arr[i+1]){
                return arr[i+1];
            }
        }
        
        return -1;
    }
}
