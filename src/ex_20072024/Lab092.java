package ex_20072024;
import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        {// If Else - Condition  ( If, else If , else) - multiple condition

            // Switch - Better way to 2+ condition
            // Which day it is - Day to from 1 to 7
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter which day of the week 1,2,3,4,5,6,7 ?");
           int day = sc.nextInt();

           switch (day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("No idea what day it is");
                break;
        }
        }
    }
}
