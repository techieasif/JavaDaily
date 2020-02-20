package JavaClasses;

/**
 * Created by @techieasif on February, 2020
 */
public class Account {
    private String customerName;
    private String customerEmailAddress;
    private double balance;
    private int customerPhoneNumber;

Account(){
    this("Asif", "abcgd", 678.0, 9788776);
        System.out.println("Default Constructor Called");
}
    Account(String name, String email,  double bal, int cNumber) {
        System.out.println("Parameterized Constructor Called");
        System.out.println("Name : "+name);
        this.customerName =name;
        this.customerEmailAddress=email;
        this.balance = bal;
        this.customerPhoneNumber = cNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposited "+ depositAmount + " new Total balance :" + this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance - withdrawalAmount <0){
            System.out.println(this.balance + " Insufficient Balance Can't Process Request");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println(withdrawalAmount + " withdrawal" + " new Total Balance " + this.balance);
        }
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
