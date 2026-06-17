public class Patterns02 {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        // Pattern 7
        for (int i = 1; i <= 4; i++) {
            if (i == 1 || i == 4) {
                for (int j = 1; j <= 6; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 6; j++) {
                    if (j == 1 || j == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // Pattern 8
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == 2 || i == 6) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {

                        System.out.print(" ");

                    }

                }
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // Pattern 9
        for (int i = 1; i <= 5; i++) {

            // Part 1
            for (int j = 1; j <= (5 - i); j++) {
                System.out.print(" ");
            }
            // Part 2
            if (i == 1 || i == 5) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("---------------------------------");

        // Pattern 10
        int n = 5;
        // Part 1
        for (int i = 1; i <= n; i++) {
            // part 1
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // part 2
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // part 3
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Part2
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                continue;
            }
            // Part1
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // Part2
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            // Part1
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // Pattern 11
        n = 4;
        for (int i = 1; i <= n; i++) {

            // Part 1
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Part 2
            if (i == 1) {
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for (int j = 1; j <= (2 * i - 3); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

        }

        // part 2
        for (int i = 1; i < n; i++) {
            // Part I
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Part II
            if (i == (n - 1)) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= 2 * (n - i) - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        // Pattern 12
        n = 4;
        // part1
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // part2

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= (2 * i - 2); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
