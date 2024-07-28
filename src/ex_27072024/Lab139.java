package ex_27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 95;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        // System.out.println(marks[10]);
        System.out.println("************");
        for (int i = 0; i <= 2; i++) {
            System.out.println(marks[i]);
                  }
        boolean []is_married = {true, false, true};
        for(int i=0; i<=2; i++)
        {
            System.out.println(is_married[i]);
        }

        String[]weekDays={"sunday","monday","tuesday","wednesday","thursday"};
        for(int i=0;i<=4;i++)
        {
            System.out.println(weekDays[i]);
        }

    }
}
