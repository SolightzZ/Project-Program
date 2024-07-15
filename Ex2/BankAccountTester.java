/*
    รหัสนักศึกษา : ุ66040233122
    ชื่อ - สกุล : นายปณฺิธิ จ่าเหม

 */
import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount account = new BankAccount();
        account.showAccountInfo();

        for (int i = 0; i < 3; i++) {
            System.out.print("ฝากเงินจำนวน ");
            double deposit = input.nextDouble();
            account.deposit(deposit);
        }
        for (int i = 0; i < 2; i++) {
            System.out.print("ถอนเงินจำนวน ");
            double withdraw = input.nextDouble();
            account.withdraw(withdraw);
        }
        account.showAccountInfo();

    }
}
