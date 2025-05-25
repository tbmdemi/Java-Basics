public class Solution {
    private int numerator;
    private int denominator = 1;

    /**
     * Constructor tao phan so.
     * @param numerator la tu so.
     * @param denominator la mau so.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * Kiem tra denominator khac 0.
     * @param denominator la mau so.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Tim ucln giua hai so nguyen.
     * @param a so nguyen thu nhat.
     * @param b so nguyen thu hai.
     * @return ucln.
     */
    public  int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        return new Solution(numerator / gcd, denominator / gcd);
    }

    /**
     * Cong hai phan so.
     * @param other phan so thu hai.
     * @return Tong cua hai phan so.
     */
    public Solution add(Solution other) {
        int num = numerator * other.denominator + other.numerator * denominator;
        int den = denominator * other.denominator;
        return new Solution(num, den);
    }

    /**
     * Tru hai phan so.
     * @param other phan so thu hai.
     * @return Hieu cua hai phan so.
     */
    public Solution subtract(Solution other) {
        int num = numerator * other.denominator - other.numerator * denominator;
        int den = denominator * other.denominator;
        return new Solution(num, den);
    }

    /**
     * Nhan hai phan so.
     * @param other phan so thu hai.
     * @return Tich cua hai phan so.
     */
    public Solution multiply(Solution other) {
        int num = numerator * other.numerator;
        int den = denominator * other.denominator;
        return new Solution(num, den);
    }

    /**
     * Thuong cua hai phan so.
     * @param other phan so khac.
     * @return Thuong cua hai phan so.
     */
    public Solution divide(Solution other) {
        if (other.numerator != 0) {
            int num = numerator * other.denominator;
            int den = denominator * other.numerator;
            return new Solution(num, den);
        }
        return this;
    }

    /**
     * So sanh 1 phan so va 1 obj.
     * @param obj chua xac dinh kieu.
     * @return Hai phan so bang nhau hay khong.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            return numerator * other.denominator == denominator * other.numerator;
        }
        return false;
    }
}
