import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<Customer> customerList = new ArrayList<>();

    /**
     * Doc thong tin khach hang tu file.
     * @param inputStream file.
     */
    public void readCustomerList(InputStream inputStream) {
        Scanner sc = new Scanner(inputStream);
        Customer currCus = null;

        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                // Neu dong trong thi tiep tuc
                continue;
            }

            String[] parts = line.split(" ");

            if (parts.length >= 2 && parts[parts.length - 1].matches("\\d{9}")) {
                // Neu parts co nhieu hon 2 ki tu
                // Phan tu cuoi cung co 9 ki tu
                long id = Long.parseLong(parts[parts.length - 1].trim());
                StringBuilder name = new StringBuilder();

                for (int i = 0; i < parts.length - 1; i++) {
                    // Bien name la ten va dang la array
                    name.append(parts[i]).append(" ");
                }
                // user_name la 1 chuoi String
                String userName = name.toString().trim();

                currCus = new Customer(id, userName);
                customerList.add(currCus);

            } else if (parts.length == 3 && parts[0].matches("\\d{10}")) {
                // Xet dong STK & trang thai
                long accNumber = Long.parseLong(parts[0].trim());
                String type = parts[1].trim().toUpperCase();
                double balance = Double.parseDouble(parts[2].trim());

                Account account = null;
                if (type.equals(Account.CHECKING)) {
                    account = new CheckingAccount(accNumber, balance);
                } else if (type.equals(Account.SAVINGS)) {
                    account = new SavingsAccount(accNumber, balance);
                }

                if (account != null && currCus != null) {
                    currCus.addAccount(account);
                }
            }
        }
        sc.close();
    }

    /**
     * Tra ve thong tin khach hang theo ten.
     * @return thong tin khach hang
     */
    public String getCustomersInfoByNameOrder() {
        List<Customer> sorted = new ArrayList<>(customerList);
        sorted.sort(Comparator.comparing(Customer::getFullName));

        StringBuilder sb = new StringBuilder();
        for (Customer customer : sorted) {
            sb.append(String.format("Số CMND: %d. Họ tên: %s.\n",
                    customer.getIdNumber(), customer.getFullName()));
        }
        return sb.toString();
    }

    /**
     * Tra ve thong tin khach hang theo so cmnd.
     * @return thong tin khach hang
     */
    public String getCustomersInfoByIdOrder() {
        List<Customer> sorted = new ArrayList<>(customerList);
        sorted.sort(Comparator.comparingLong(Customer::getIdNumber));

        StringBuilder sb = new StringBuilder();
        for (Customer customer : sorted) {
            sb.append(String.format("Số CMND: %d. Họ tên: %s.\n",
                    customer.getIdNumber(), customer.getFullName()));
        }
        return sb.toString();
    }

    /**
     * Tra ve danh sach khach hang.
     * @return ds khach hang.
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }
}