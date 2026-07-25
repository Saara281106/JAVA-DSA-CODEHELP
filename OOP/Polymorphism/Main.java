public class Main {

    static void doDrawingStuff(Shape s){
            s.draw();
        }
    public static void main(String[] args){

        // Method Overloading (Static Polymorphism)
        System.out.println("Hello again after such a long period!");
        System.out.println("Now will try best to stay consistent for next 75 days!");

        Addition A = new Addition();
        System.out.println(A.add(4 , 10));
        System.out.println(A.add(4,10,6));

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        // Function overriding (Runtime Polymorphism)

        Circle c = new Circle();
        c.draw();

        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();

        //Upcasting (Runtime Polymorphism)

        doDrawingStuff(c);
        Rectangle r = new Rectangle();
        doDrawingStuff(r);

        Shape s = new Shape();
        doDrawingStuff(s);

        System.out.println();
    }
}
