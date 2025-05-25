import java.util.Locale;

public class InvalidFundingAmountException extends BankException {
    public InvalidFundingAmountException(String message) {
        super(message);
    }

    public InvalidFundingAmountException(double amount) {
        super(String.format(Locale.US, "Số tiền không hợp lệ: $%.2f", amount));
    }
}
