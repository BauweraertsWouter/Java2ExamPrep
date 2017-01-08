package bankaccount;

public class BankAccount {
    private String account;

    public BankAccount(String account) {
        this.account = account;
    }

    public String toString() {
        return account.substring(0, 4) + " "
                + account.substring(4, 8) + " "
                + account.substring(8, 12) + " "
                + account.substring((12));
    }
}

