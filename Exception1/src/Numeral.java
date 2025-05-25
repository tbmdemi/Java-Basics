public class Numeral extends Expression {
    private final double value;

    public Numeral() {
        this.value = 0.0;
    }

    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Tra ve chuoi cua phep tinh.
     *
     * @return chuoi cua phep tinh
     */
    @Override
    public String toString() {
        if (value == Math.floor(value) && !Double.isInfinite(value)) {
            return Integer.toString((int) value);
        } else {
            return Double.toString(value);
        }
    }

    /**
     * Tra ve ket qua cua phep tinh.
     *
     * @return ket qua cua phep tinh
     * @throws ArithmeticException ngoai le tinh toan
     */
    @Override
    public double evaluate() throws ArithmeticException {
        return this.value;
    }
}
