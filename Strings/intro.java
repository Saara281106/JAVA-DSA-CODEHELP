public class intro {

    static String reverse(String str) {
        String reverse = "";
        for (int i = (str.length() - 1); i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        // String str = "Saara";
        // System.out.println(str);

        // String s = new String("Neeraj");
        // System.out.println(s);

        String str = "NooN";
        System.out.println("------------------");
        // Question 1
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("------------------");
        // Question 2
        char ch[] = str.toCharArray();
        int count = 0;
        for (char i : ch) {
            count++;
        }
        System.out.println("Length of String is: " + count);

        System.out.println("------------------");
        // Question 3
        int countVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                countVowels++;
            }
        }
        System.out.println("No. of vowels are: " + countVowels);

        System.out.println("------------------");
        // Question 4
        for (int i = (str.length() - 1); i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("OR");
        System.out.println(reverse(str));

        System.out.println("------------------");
        // Question 5
        String str2 = reverse(str);
        if (str.equals(str2)) {
            System.out.println("Yes, its a Palindrome!!!");
        } else {
            System.out.println("No, its not a palindome!!!");
        }

        System.out.println("------------------");
        
    }
}
