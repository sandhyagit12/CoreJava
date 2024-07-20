package ex_14072024;

public class Lab070 {
    public static void main(String[] args) {
        String s1 = new String("Pramod");
        String s2 = new String("Pramod");
        //  In Heap area 2 strings s1,s2 are created each have the value pramod
        String s3  = s1;
        //  2, heap  s3 -> s1 -> Pramod s3 points to s1
    }
}
