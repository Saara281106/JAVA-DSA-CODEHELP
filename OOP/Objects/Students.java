public class Students {
    //Attributes
    public String name;
    public int age;
    public int id;
    public int nos;

    //Construtor
    public Students(String name , int age , int id , int nos){
        System.out.println("Hello, Student constructor is called!");
        this.name = name;
        this.age = age;
        this.id = id;
        this.nos = nos;
    }

    //Methods
    public void study(){
        System.out.println(name + " is studying");
    }
    public void walk(){
        System.out.println(name + " is walking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
