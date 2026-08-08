public class TwoUniqueNum {
    public static void main(String[] args){
        System.out.println();

        int arr[] = {2 , 3 , 4 , 2 , 13 , 21 , 3 , 4};
        int n = 8;

        int ans = 0;
        for(int i=0 ; i<n ; i++){
            ans = ans^arr[i];
        }

        // System.out.println("The XOR of Unique Numbers is : " + ans);

        //Now we have to find 2 unique numbers 

        int bit = (ans) & (-ans);

        int num1 = 0;
        int num2 = 0;
        for(int i=0 ; i<n ; i++){

            if((arr[i] & bit) == 0){
                num1 = num1^arr[i];
            }
            else{
                num2 = num2^arr[i];
            }
            
        }

        System.out.println("The two unique numbers are : " + num1 + " and " + num2);

        System.out.println();
    }
}
