public abstract class BinaryExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Tra ve chuoi cua phep tinh.
     *
     * @return chuoi cua phep tinh
     */
    @Override
    public abstract String toString();

    /**
     * Tra ve ket qua cua phep tinh.
     *
     * @return ket qua cua phep tinh
     * @throws ArithmeticException ngoai le tinh toan
     */
    @Override
    public abstract double evaluate() throws ArithmeticException;
}
