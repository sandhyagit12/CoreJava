package Single_Inheritance;

import java.util.Scanner;
//import july.ex_28072024_OOPS.Bank;
public class Lab170_PC_NotWorking {
    public static void main(String[] args) {
  BankAccount ba1 = new BankAccount();
  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bank name");
        String bName = sc.next();

        System.out.println("Enter the bank balance");
        int bal=sc.nextInt();

        System.out.println("Enter the BankCode");
        String bCode = sc.next();

        BankAccount baicici = new BankAccount(bName, bal, bCode);
        baicici.printDetails();
        sc.close();

    }
}
