package ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        String name = "SanDhya";

        String name2 = new String("Sandhya");
        // string can be created in 2 ways using
        // = , new operator
        // =  creates string in "SCP" // Sting constant Pool
        // new - Object created in the heap memory

        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(10)); // Exception Index 10 out of bounds
    }
}
