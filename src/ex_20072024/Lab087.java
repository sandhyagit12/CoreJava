package ex_20072024;
import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
       // Take the user input directly and check if the input is odd or even
        //identify the inputs
        //Identify the data types
        //Do we need conversions or use directly
        //rough logic num%2 ==0 eve, odd?
        //optimize
        //int size 32 bits, range (2,147,483,647)
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int user_input = sc.nextInt();
        if(user_input%2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");

        }
        }


    }

