public class FindSingleNumber {
    public static void main(String[] args){
        int arr[] = {10 , 24 , 17 , 24 , 10 ,  17 , 18 ,18 , 665  };
        int n = 9;

        int ans = 0;
        for(int i = 0 ; i<n ; i++){
            ans = ans^arr[i];
        }

        if(ans !=0){
            System.out.println("There is one single number present: " + ans);
        }
        else{
            System.out.println("All Numbers exist in pairs.");
        }
    }
}
