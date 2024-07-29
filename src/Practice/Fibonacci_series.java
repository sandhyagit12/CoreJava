package Practice;

public class Fibonacci_series {
    public static void main(String[] args) {
        int a =0;
        int b=1;
       // System.out.println(a);
       // System.out.println(b);
        for(int i=2;i<=10;i++){
            int sum =a+b;
            a=b;
            b=sum;
            System.out.print(sum);
            System.out.print("\t");
        }
    }
}
