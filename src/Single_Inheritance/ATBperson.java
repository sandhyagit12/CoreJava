package Single_Inheritance;

public class ATBperson {
    String name;
    long phone;
    //DC
    ATBperson(){
        System.out.println("Object is created");

    }
    ATBperson(String nameGiven){
        this.name=nameGiven;
    }

    ATBperson(String nameGiven,long phoneNumber)
    {
        this.name=nameGiven;
        this.phone=phoneNumber;
    }
}
