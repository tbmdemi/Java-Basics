public class Addition extends BinaryExpression {
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Tra ve chuoi cua phep tinh.
     *
     * @return chuoi cua phep tinh
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    /**
     * Tra ve ket qua cua phep tinh.
     *
     * @return ket qua cua phep tinh
     * @throws ArithmeticException ngoai le tinh toan
     */
    @Override
    public double evaluate() throws ArithmeticException {
        return left.evaluate() + right.evaluate();
    }
}
