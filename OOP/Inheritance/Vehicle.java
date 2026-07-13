public class Vehicle {
    String name;
    String model;
    int noOfTyres;

    Vehicle(){
        System.out.println("This is default CONSTRUCTOR");
    }
    Vehicle(String name , String model , int noOfTyres){
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine(){
        System.out.println("The Engine of: " + name + " : " + model + " is STARTING");
    }
    void stopEngine(){
        System.out.println("The Engine of: " + name + " : " + model + " is STOPPING");
    }
}
