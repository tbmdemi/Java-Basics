public class Division extends BinaryExpression {
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Tra ve chuoi cua phep tinh.
     *
     * @return chuoi cua phep tinh
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * Tra ve ket qua cua phep tinh.
     *
     * @return ket qua cua phep tinh
     * @throws ArithmeticException ngoai le tinh toan
     */
    @Override
    public double evaluate() throws ArithmeticException {
        double check = right.evaluate();
        if (check == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return left.evaluate() / check;
        }
    }
}
