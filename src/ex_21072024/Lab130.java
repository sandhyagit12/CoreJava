package ex_21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num for factorial result");
        int n= sc.nextInt();
        int num = n;
        int fact=1;
        int i=1;
        while(i<=n)
        {
          fact = fact*n;
          n--;
        }
        System.out.println("factorial of " +num + "is" +fact);
    }}
