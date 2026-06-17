public class Patterns03 {
    public static void main(String[] args) {

        System.out.println("---------------------------------");

        // Pattern 13
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // Pattern 14

        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((count++) + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // Pattern 15

        for (int i = 1; i <= 5; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // Pattern 16

        for (int i = 1; i <= 5; i++) {
            char ch = 'E';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // Pattern 17
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Part1
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            // Part2
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            // Part1
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            // part 1
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // part 2
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // part 3
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            count = i - 1;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        //Pattern 19

        for(int i=1 ; i<=4 ; i++){
            for(int j=1 ; j<=4-i ; j++){
                System.out.print("  ");
            }
            for(int j=1 ; j<=(2*i - 1); j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        //Pattern 20
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            char ch1 = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch1 + " ");
                ch1++;
            }
            int x= i-1;
            int y= 'A' - 1;
            int ch_ = x+y;
            char ch2 = ((char) (ch_));
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(ch2 + " ");
                ch2--;
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

    }
}
