public class Student {
    
    public String name;
    public String hobby;
    public int age;
    private String gf;

    public Student(String name ,String hobby , int age ,  String gf){
        System.out.println("You have created the object for Student class!");
        this.name = name;
        this.hobby = hobby;
        this.age = age;
        this.gf = gf;
    }

    public Student(Student srcObj){
        System.out.println("You have called the copy constructor!!");
        this.name = srcObj.name;
        this.hobby = srcObj.hobby;
        this.age = srcObj.age;
        this.gf = srcObj.gf;
    }

    public String getGF(){
        return this.gf;
    }
}
