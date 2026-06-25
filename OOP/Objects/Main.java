public class Main {
    public static void main(String[] args){

        //simple constructor
        // Students S1 = new Students();

        // S1.name = "Saara";
        // S1.age = 19;
        // S1.id = 316;
        // S1.nos = 2;
        // System.out.println(S1.name);
        // System.out.println(S1.age);
        // System.out.println(S1.id);
        // System.out.println(S1.nos);
        // S1.study();
        // S1.walk();
        // S1.sleep();

        //Parameterized Constructor
        Students S2 = new Students("Saara" ,19 , 1 , 2);
        System.out.println(S2.name);
        System.out.println(S2.age);
        System.out.println(S2.id);
        System.out.println(S2.nos);
        S2.study();
        S2.walk();
        S2.sleep();



    }
}
