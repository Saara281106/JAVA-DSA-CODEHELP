public class Main {
    public static void main(String[] args){
        System.out.println();
        System.out.println("Hello World again Its day 2 of 75 Days of showing uo challange");
        System.out.println();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Crow());

    }

    static void doBirdStuff(Bird b){
        b.fly();
        b.eat();
    }
}
