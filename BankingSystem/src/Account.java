import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";

    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {}

    /**
     * Constructor.
     * @param accountNumber so tai khoan
     * @param balance so du
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Tra ve so du.
     * @return so du
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Tra ve so tai khoan.
     * @return so tai khoan
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Rut tien.
     * @param amount so tien
     * @throws BankException neu so tien khong hop le
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else {
            double initialBalance = balance;
            balance -= amount;
            int type = (this instanceof CheckingAccount)
                    ? Transaction.TYPE_WITHDRAW_CHECKING : Transaction.TYPE_WITHDRAW_SAVINGS;
            addTransaction(new Transaction(type, amount, initialBalance, balance));
        }
    }

    /**
     * Nap tien.
     * @param amount so tien
     * @throws BankException neu so tien khong hop le
     */
    public void doDepositing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else {
            double initialBalance = balance;
            balance += amount;
            int type = (this instanceof CheckingAccount)
                    ? Transaction.TYPE_DEPOSIT_CHECKING : Transaction.TYPE_DEPOSIT_SAVINGS;
            addTransaction(new Transaction(type, amount, initialBalance, balance));
        }
    }

    /**
     * Lop truu tuong rut tien.
     * @param amount so tien
     */
    public abstract void withdraw(double amount);

    /**
     * Lop truu tuong nap tien.
     * @param amount so tien
     */
    public abstract void deposit(double amount);

    /**
     * Tra ve lich su giao dich.
     * @return lich su giao dich
     */
    public String getTransactionHistory() {
        StringBuilder history = new
                StringBuilder(String.format("Lịch sử giao dịch của tài khoản %d:",
                accountNumber));
        history.append("\n");

        for (Transaction transaction : transactionList) {
            history.append(transaction.getTransactionSummary());
            history.append("\n");
        }
        return history.toString();
    }

    /**
     * Them vao lich su giao dich.
     * @param transaction giao dich
     */
    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    /**
     * Kiem tra stk.
     * @param obj object
     * @return true or false
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return accountNumber == account.accountNumber;
    }
}
