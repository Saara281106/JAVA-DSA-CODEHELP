public class Sort0sAnd1s {
    public static void main(String[] args) {
        System.out.println();

        int arr[] = { 0, 1, 0, 1, 0, 1 };
        int ans[] = sorting(arr);

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println();
    }

    static int[] sorting(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];

        //Adding all 0s to new array first
        int k=0;
        for(int i=0 ; i<n ; i++){
            if(arr[i] == 0){
                ans[k] = arr[i];
                k++;
            }
        }
        for(int i=0 ; i<n ; i++){
            if(arr[i] == 1){
                ans[k] = arr[i];
                k++;
            }
        }
        


        return ans;
    }
}
