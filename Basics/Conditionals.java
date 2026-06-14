
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Doing Homework questions!

        Scanner sc = new Scanner(System.in);

        // Question 1
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>17){
        System.out.println("You are eligible to vote!");
        }
        else{
        System.out.println("You are not eligible to vote");
        }

        // Question 2
        System.out.print("Enter marks in English: ");
        float eng = sc.nextFloat();
        System.out.print("Enter marks in Maths: ");
        float maths = sc.nextFloat();
        System.out.print("Enter marks in Science: ");
        float sci = sc.nextFloat();
        System.out.print("Enter marks in Social Science: ");
        float ss = sc.nextFloat();
        System.out.print("Enter marks in Computer: ");
        float comp = sc.nextFloat();

        if (eng > 100.00 || maths > 100.00 || sci > 100.00 || ss > 100.00 || comp > 100.00) {
            System.out.println("Inavlid marks");
        }

        else {
            float total = eng + maths + sci + ss + comp;
            float per = (total / 500) * 100;
            System.out.println("Total percentsge is: " + per);
        }

        //Questiuon 3
        //System.out.print("Enter Lowercase Character")

        sc.close();
    }
}
