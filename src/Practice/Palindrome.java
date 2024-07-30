package Practice;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Madam";
        s= s.toLowerCase();
        boolean b = true;
        for (int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                System.out.println(s.charAt(i));
                System.out.println(s.length()-i-1);
                System.out.println("it is not a palindrome");
                b=false;
                break;
            }
        }
        if(b==true){
        System.out.println("It is a palindrome string");
    }

}}
