public class SquareRoot {
    public static void main(String[] args){
        System.out.println();

        int x = 56;
        double sqrt = squareRootWithPrecision(x);
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

    static double squareRootWithPrecision(int x){
        double ans = -1.000;
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

        double factor = 1;
        for(int i=1 ; i<=4 ; i++){
            factor = factor/10;
            for(int j=1 ; j<=9 ; j++){
                double value = ans + factor;
                if(value <= x/value){
                    ans = value;
                } else{
                    break;
                }
            }
        }

        //Round of
        ans = Math.round(ans*1000.0)/1000.0;

        return ans;
    }
}
