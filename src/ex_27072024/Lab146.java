package ex_27072024;
import java.util.Scanner;
public class Lab146 {
    public static void main(String[] args) {
            // enter the system input for 5 subjects
        //average of 5 subjects
        Scanner sc= new Scanner(System.in);
        int [] marks=new int[5];
        for(int i =0;i<marks.length;i++) {
            System.out.println("Enter the marks for subject" + (i + 1));
            marks[i]= sc.nextInt();
        }
float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
        System.out.println("avg of marks"+avg);
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
