public class Transaction {
    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit"; // nap
    public static final String WITHDRAW = "withdraw"; // rut

    /**
     * Constructor.
     * @param operation lệnh
     * @param amount số tiền
     * @param balance số dư
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static String getDeposit() {
        return DEPOSIT;
    }

    public String getWithdraw() {
        return WITHDRAW;
    }
}
