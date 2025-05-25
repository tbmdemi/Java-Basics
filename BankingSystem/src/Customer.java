import java.util.ArrayList;
import java.util.List;

public class Customer {
    //Mot khach hang co nhieu tai khoan
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    /**
     * Constructor co tham so.
     * @param idNumber so CCCD.
     * @param fullName ho va ten.
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * Constructor khong tham so.
     */
    Customer() {}

    /**
     * Tra ve thong tin khach hang.
     * @return thong tin khach hang
     */
    public String getCustomerInfo() {
        return String.format("ID: %d, Họ tên: %s", idNumber, fullName);
    }

    /**
     * Them account vao list.
     * @param account tai khoan
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Xoa account khoi list
     * @param account tai khoan
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * Tra ve so cccd.
     * @return so cccd
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * Thay doi so cccd.
     * @param idNumber so cccd.
     * @return so moi.
     */
    public long setIdNumber(long idNumber) {
        return this.idNumber = idNumber;
    }

    /**
     * Tra ve ho va ten.
     * @return ho va ten.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Thay doi ho va ten.
     * @param fullName ho va ten
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Tra ve danh sach tai khoan.
     * @return danh sach tai khoan
     */
    public List<Account> getAccountList() {
        return accountList;
    }
}
