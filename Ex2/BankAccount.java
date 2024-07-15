/*
    รหัสนักศึกษา : ุ66040233122
    ชื่อ - สกุล : นายปณฺิธิ จ่าเหม

 */

public class BankAccount {
    private String accountNo;
    private String accountName;
    private double balance;

    public BankAccount(){
        this.accountNo = "66040233122";
        this.accountName = "Paniti Jahem";
        this.balance = 500.0;
    }
    public BankAccount(String accountNo, String accountName, double balance){
        this.accountNo = accountNo;
        this.accountName = accountName;2
        this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
    public void showAccountInfo() {
        System.out.println("\n+++++ ข้อมูลบัญชีธนาคาร +++++");
        System.out.println("หมายเลขบัญชี : " + accountNo);
        System.out.println("ชื่อบัญชี : " + accountName);
        System.out.println("ยอดเงินคงเหลือ : " + balance);
        System.out.println("-------------------------------------------------");
    }
}







