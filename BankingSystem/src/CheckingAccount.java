public class CheckingAccount extends Account {
    /**
     * Constructor tu ham cha.
     */
    public CheckingAccount() {
        super();
    }

    /**
     * Constructor co tham so.
     * @param accountNumber so tai khoan.
     * @param balance so du
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    /**
     * Ghi de rut tien.
     * @param amount so tien
     */
    @Override
    public void withdraw(double amount) {
        try {
            doWithdrawing(amount);
        }  catch (BankException e) {
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
