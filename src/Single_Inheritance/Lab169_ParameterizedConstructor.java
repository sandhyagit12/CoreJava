package Single_Inheritance;

public class Lab169_ParameterizedConstructor {
    public static void main(String[] args) {
        ATBperson p0 = new ATBperson();//DC invoked
        ATBperson p1 = new ATBperson("Pramod");
        ATBperson p2 = new ATBperson("Amit");
        ATBperson p3 = new ATBperson("Shrihan",976543210);

        System.out.println(p0.name);
        System.out.println(p1.name);
        System.out.println(p2.phone);



        System.out.println(p3.name);
        System.out.println(p3.phone);
    }
}
