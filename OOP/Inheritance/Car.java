public class Car extends Vehicle {
    int noOfDoors;
    String TransmissionType;

    Car(String name , String model , int noOfTyres , int noofDoors , String TransmissionType){
        super(name , model , noOfTyres);
        this.noOfDoors = noofDoors;
        this.TransmissionType = TransmissionType;
    }

    void startAC(){
        System.out.println("The AC of " + name + " : " + model + " is starting");
    }
}
