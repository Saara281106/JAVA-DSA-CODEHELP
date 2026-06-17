public class Patterns01 {
    public static void main(String[] args) {

        System.out.println("---------------------------------");
        
        // Pattern 1
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        // Pattern 2
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        // Pattern 3
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        //Pattern 4
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<= 5-i+1 ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        //Pattern 5
        for(int i=1 ; i<=5 ; i++){
            //part 1
            for(int j=1 ; j<=5-i ; j++){
                System.out.print(" ");
            }
            //part 2
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            //part 3
            for(int j=1 ; j<= i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        //Patter 6
        for(int i=1 ; i<=4 ; i++){
            //Part1
            for(int j=1 ; j<=i-1 ; j++){
                System.out.print(" ");
            }
            //Part2
            for(int j=1 ; j<=4-i+1 ; j++){
                System.out.print("*");
            }
            //Part1
            for(int j=1 ; j<=4-i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

    }
}
