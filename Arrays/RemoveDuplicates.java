public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println();

        // Task is to remove duplicates ans return new length without duplicates

        int arr[] = { 1, 2, 3, 3, 3, 4, 4, 5 };

        System.out.println("Orinal Array:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Array after removing duplicates:-");
        removeDuplicate(arr);

        System.out.println();
    }

    static void removeDuplicate(int arr[]) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        while (j < n) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        for (int x = 0; x <= i; x++) {
            System.out.print(arr[x] + " ");
        }
        // for(int x=i+1 ; x<n ; x++){
        // arr[x] = 0;
        // }
    }
}
