import java.util.Locale;

public class InsufficientFundsException extends BankException {
    public InsufficientFundsException(String message) {
        super(message);
    }

    public InsufficientFundsException(double amount) {
        super(String.format(Locale.US, "Số dư tài khoản không đủ $%.2f để thực hiện giao dịch",
                                        amount));
    }
}
