package ex_28072024_OOPS;

public class Lab159 {
    public static void main(String[] args) {
        Bank bank1= new Bank();
        Bank bank2 = new Bank();

        bank1.name = "SBI";
        bank2.name = "ICICI";
        System.out.println(bank1.name);
        System.out.println(bank1.balance);

        System.out.println("The default value is updated to 100");

        bank2.balance =100;
        System.out.println(bank2.name);
        System.out.println(bank2.balance);
    }
}
