public class Main {
    public static void main(String[] args){

        Student S1 = new Student("Neeraj" , "Cooking" , 19 , "Saara");

        System.out.println("Name: " + S1.name);
        String GirlFriend = S1.getGF();
        System.out.println("Girlfriend Name: " + GirlFriend);


        //Copy Constructor
        Student S2 = new Student(S1);
        S2.name = "Nitesh Kumar";

        System.out.println("Name of S2: " + S2.name);
        String Girl = S2.getGF();
        System.out.println("Girlfriend Name of S2: " + Girl);

    }
}
