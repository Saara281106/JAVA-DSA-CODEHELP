public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 1, 2, 3, 4, 5, 4, 3 };

        System.out.println("Orinal Array:-");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        removeDuplicate(arr);

        System.out.println();
        System.out.println("Array after removing duplicates:-");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static void removeDuplicate(int arr[]){
        int n = arr.length;
    }
}
