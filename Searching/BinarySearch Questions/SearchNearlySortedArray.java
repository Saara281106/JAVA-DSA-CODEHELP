public class SearchNearlySortedArray {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Ram Ram ji");

        int arr[] = { 10, 30, 20, 50, 40, 70, 60, 80 };
        int target = 30;
        int index = search(arr, target);
        System.out.println("The target is present at index: " + index);

        System.out.println();
        System.out.println();
    }

    static int search(int arr[], int target) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            } 
            if(mid-1 >= 0 && arr[mid-1] == target){
                return (mid - 1);
            }
            if(mid+1 <= arr.length -1 && arr[mid+1] == target){
                return (mid + 1);
            }

            if(target > arr[mid]){
                s = mid + 2;
            } else{
                e = mid - 2;
            }

        }
        return ans;
    }
}
