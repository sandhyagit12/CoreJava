package Practice;

public class RemovesplChar_Notworking {
    public static void main(String[] args) {
         String input="Hello, World! @2024 #Java$";
         //regular expression - pattern which you want to change
        String output = input.replace("^[a-zA-z0-9]"," ");
        System.out.println(output);
    }
}
