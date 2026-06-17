public class Methods {

    //Question 1
    static void printWelcomeMessage(){
        System.out.println("Welcome to Methods in Java!");
    }

    //Question 2
    static int sum(int a, int b){
        return a+b;
    }

    //Question 3
    static boolean isEven(int num){
        if((num%2) == 0){
            return true;
        }
        return false;
    }

    //Question 4
    static int getMax(int a , int b){
        if(a>b){
            return a;
        }
        else if(b>a){
            return b;
        }
        else{
            return a;
        }
    }

    //Question 5
    static float calculatePercentage (float obtained , float total){
        float ans = (obtained/total)*100 ;
        return ans;
    }

    //Question 6
    static void display(int num){
        System.out.println(num);
    }
    static void display(String a){
        System.out.println(a);
    }

    //Question 7
    static void update(int n){
        System.out.println(n);
        n = 10*n;
        System.out.println(n);
    }
    public static void main(String[] args){  

        printWelcomeMessage();

        int ans1 = sum(10,15);
        System.out.println(ans1);

        boolean ans2 = isEven(78);
        System.out.println(ans2);

        int ans3 = getMax(45, 400);
        System.out.println(ans3);

        float ans4 = calculatePercentage(450 , 500);
        System.out.println(ans4);

        display(300);
        display("Saara");

        int n = 8;
        System.out.println(n);
        update(n);
        System.out.println(n);



    }
}
