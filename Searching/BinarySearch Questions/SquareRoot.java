public class SquareRoot {
    public static void main(String[] args){
        System.out.println();

        int x = 1000000;
        int sqrt = squareRoot(x);
        System.out.println("Square Root of " + x + " is: " + sqrt);

        System.out.println();
        System.out.println();
    }

    static int squareRoot(int x){
        int ans = -1;
        int s = 1;
        int e = x;

        if(x==0){
            return 0;
        }

        while(s<=e){
            int mid = s+((e-s)/2);
            if(mid <= x/mid){
                ans = mid;
                s = mid + 1;
            } else{
                e = mid - 1;
            }
        }

        return ans;
    }
}
