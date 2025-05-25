public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_DEPOSIT_SAVINGS = 2;
    public static final int TYPE_WITHDRAW_CHECKING = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    private int type;
    private double amount;
    private double initialBalance; // So du truoc giao dich
    private double finalBalance; // So du sau giao dich

    /**
     * Constructor.
     * @param type dai dien thao tac.
     * @param amount tong so tien.
     * @param initialBalance so du truoc giao dich.
     * @param finalBalance so du sau giao dich.
     */
    Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    /**
     * Tra ve kieu thao tac.
     * @param type dai dien thao tac
     * @return kieu thao tac
     */
    private String getTransactionTypeString(int type) {
        switch (type) {
            case TYPE_DEPOSIT_CHECKING:
                return "Nạp tiền vãng lai";
            case TYPE_WITHDRAW_CHECKING:
                return "Rút tiền vãng lai";
            case TYPE_DEPOSIT_SAVINGS:
                return "Nạp tiền tiết kiệm";
            case TYPE_WITHDRAW_SAVINGS:
                return "Rút tiền tiết kiệm";
            default:
                return "";
        }
    }

    /**
     * Tra ve thong tin giao dich.
     * @return thong tin giao dich
     */
    public String getTransactionSummary() {
        return String.format("- Kiểu giao dịch: %s. "
                        + "Số dư ban đầu: $%.2f. "
                        + "Số tiền: $%.2f. "
                        + "Số dư cuối: $%.2f.",
                getTransactionTypeString(type), initialBalance, amount, finalBalance);
    }
}