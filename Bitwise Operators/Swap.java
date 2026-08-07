public class Swap {
    public static void main(String[] args){
        
        int a = 5;
        int b = 6;
        //Initial
        System.out.println("Initial values of a and b are :-");
        System.out.println( "a : " +  a);
        System.out.println( "b : " + b);

        a = a^b;
        b = a^b; 
        a = a^b;

        //Final
        //Initial
        System.out.println("Final values of a and b are :-");
        System.out.println( "a : " +  a);
        System.out.println( "b : " + b);

    }
}
