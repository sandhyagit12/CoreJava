package ex_07072024;

public class Lab004 {
    public static void main(String[] args) {
        // Widening
        byte b=10;
        int a=b; // VALID – Implicit Casting - JVM
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);
        System.out.println(a);

        // Narrowing
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);

        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);

        int course = 100;
        float GST = 18.45F;
        float total_price = course+GST;
        System.out.println(total_price);



    }
}
