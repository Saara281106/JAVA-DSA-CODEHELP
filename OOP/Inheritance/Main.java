public class Main {
    public static void main(String[] args){
        Car c1 = new Car("Mercedes" , "SUV" , 4 , 4 , "Auto");
        System.out.println("Name and Model : " + c1.name + " : " + c1.model);
        System.out.println("No. of Typres are: " + c1.noOfTyres);
        System.out.println("No. of Doors are: " + c1.noOfDoors);
        System.out.println("Transmission Type: " + c1.TransmissionType);
        c1.startEngine();
        c1.stopEngine();
        c1.startAC();
    }
}
