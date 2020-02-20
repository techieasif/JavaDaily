package JavaClasses;

/**
 * Created by @techieasif on February, 2020
 */
public class Main {
    public static void main(String[] args) {
        Account ajayAccount = new Account();
        Account WalluAccount = new Account();

        ajayAccount.deposit(100.0);
        ajayAccount.withdrawal(45.0);

        WalluAccount.deposit(1000.0);
        WalluAccount.withdrawal(234);

    }

}
