package Practice;

import java.util.Scanner;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
////
//
//        String  = "aravind";
//
//        //char[] c = new char[s.length()];
//        String s1 = "";
//        int j = 0;
//        for (int i = s.length()-1;i>0; i--)
//        {
//            s1[j] = s.charAt(i);
//            j++;
//            System.out.print(s1[j]);
//        }
//        System.out.println();
//        for (int k=0;k<s.length();k++) {
//            System.out.print(s1[k]);

        String s= "Testing";
        //Approach1
        char arr[]=s.toCharArray();
        for(int i=(s.length()-1); i>=0; i--)
        {
            System.out.print(arr[i]);

           // System.out.print(s.charAt(i));//approach2
        }
        System.out.println();
        //Approach3
        StringBuffer name = new StringBuffer(s);
        System.out.println(name.reverse().toString());

        //Approach 4 - reverse a sentence





    }

        }



