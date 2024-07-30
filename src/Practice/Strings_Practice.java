package Practice;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Strings_Practice {
    public static void main(String[] args) {
        String s = "Testing";
        System.out.println(s.length());
        String s3= s.concat(s);
        System.out.println("strings value cannot be changed  " + s);
        System.out.println(" A new string object s2 is created for a new string" +s3);

        System.out.println(s.indexOf('g'));
        //equals() - data  should be same
        //==  - both address and data should be same
        String s2 = "Testing";
        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        //convert a string to character Array
        char ch[]= s.toCharArray();
        System.out.println("char array ");
        for(int i=0;i<ch.length;i++)
        {

            System.out.print(ch[i]);
        }

//convert th characters into lowercase
        s.toLowerCase();
        //convert the characters into uppercase
        s.toUpperCase();
        //substring
        s.substring(4,6);
        String s6= s.trim();//removes the spaces
        //convert the datatype
        int a =1000;
        String b= String.valueOf(a);
        System.out.println(b);
        //convert string to integer - Integer.parseInt
        int A=100;
       // String B = Integer.parseInt(A);
       // System.out.println(B);
//HOw to make Strings Mutable in JAVA
        //using the classes StringBuffer, StringBuilder
        //stringBuffer-multithreaded
        //StringBuilder works in single thread and there we be no race and will be slow.
        //Reverse a String
        //Remove Special characters in the string
        //Remove white spaces from A Given String
        //Find the occurances of each character in the string




    }
}
