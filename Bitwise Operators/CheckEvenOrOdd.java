import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args){
        System.out.println();


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check even or odd : ");
        int a = sc.nextInt();

        if(checkEven(a)){
            System.out.println("The number is EVEN");
        }
        else{
            System.out.println("The number is ODD");
        }

        sc.close();
        System.out.println();
    }

    static boolean checkEven(int a){

        if((a&1) == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
