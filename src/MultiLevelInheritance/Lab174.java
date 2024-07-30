package MultiLevelInheritance;

public class Lab174 {
    public static void main(String[] args) {

        // Multi Level
        // GF -> F -> Child
        Son s1 = new Son();
        s1.home(); // If name is same C -> F -> GF
        s1.c();
        s1.gf();
        s1.f();
    }
}