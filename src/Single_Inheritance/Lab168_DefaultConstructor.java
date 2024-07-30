package Single_Inheritance;

public class Lab168_DefaultConstructor {
    public static void main(String[] args) {
        ATBperson p1 = new ATBperson();
        //object 1 is created -DC is invoked
        new ATBperson();//object2 is created, DC is invoked
        new ATBperson();//Object3 is created, DC is invoked
        ATBperson p2 = null;// no object is created, nothing to do

    }
}
