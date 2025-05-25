import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    private double balance;
    private final ArrayList<Transaction> transitionList;

    /**
     * Contrucstor.
     */
    public Account() {
        this.balance = 0.0;
        this.transitionList = new ArrayList<>();
    }

    /**
     * Tạo giao dịch nạp tiền và thêm nó vào lịch sử giao dịch.
     * @param amount số tiền bạn nạp
     */
    private void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            Transaction newTrans = new Transaction(Transaction.DEPOSIT, amount, this.balance);
            transitionList.add(newTrans);
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /**
     * Tạo giao dịch rút tiền và thêm nó vào lịch sử giao dịch.
     * @param amount số tiền bạn rút
     */
    private void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
            Transaction newTrans = new Transaction(Transaction.WITHDRAW, amount, this.balance);
            transitionList.add(newTrans);
        }
    }

    /**
     * Phương thức để thực hiện rút/nạp tiền.
     * @param amount số tiền muốn xử lí
     * @param operation lệnh
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * In ra lịch sử giao dịch từ đầu đến cuối.
     */
    public void printTransaction() {
        DecimalFormat df = new DecimalFormat("$#.00");
        for (int i = 0; i < transitionList.size(); i++) {
            Transaction transaction = transitionList.get(i);

            String forAm = (df.format(transaction.getAmount()));
            String forBal = (df.format(transaction.getBalance()));

            String gd = "Giao dich ";
            String bla = ". So du luc nay: ";

            if (transaction.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.println(gd + (i + 1) + ": Nap tien " + forAm + bla + forBal + ".");
            } else {
                System.out.println(gd + (i + 1) + ": Rut tien " + forAm + bla + forBal + ".");
            }
        }
    }
}

