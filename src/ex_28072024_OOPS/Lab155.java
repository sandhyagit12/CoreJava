package ex_28072024_OOPS;

public class Lab155 {
    public static void main(String[] args) {
        //attributes of the class can be both primitive datatype, reference datatype
        //how to intialize a class
        // Classname ClassRef = new Classname();
        //class name is  the - blueprint of which classname
        //classref - is the reference to the object
        // new Classname - is the creation of object

        BuildingBP dlf = new BuildingBP();
        dlf.name = "DLF pvt Ltd";
        dlf.noOfRooms = 100;
        dlf.useLift();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige pvt Ltd";
        prestige.noOfRooms = 100;
        prestige.useLift();


    }
}
