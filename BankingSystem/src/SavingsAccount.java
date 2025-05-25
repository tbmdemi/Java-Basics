public class SavingsAccount extends Account {
    /**
     * Constructor tu ham cha.
     */
    public SavingsAccount() {
        super();
    }

    /**
     * Constructor co tham so.
     * @param accountNumber so tai khoan.
     * @param balance so du.
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Ghi de rut tien.
     * @param amount so tien
     */
    @Override
    public void withdraw(double amount) {
        try {
            if (getBalance() >= 5000 && amount <= 1000) {
                doWithdrawing(amount);
            } else {
                throw new InsufficientFundsException(amount);
            }
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Ghi de nap tien.
     * @param amount so tien
     */
    @Override
    public void deposit(double amount) {
        try {
            doDepositing(amount);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
