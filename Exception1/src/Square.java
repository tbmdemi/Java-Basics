public class Square extends Expression {
    private final Expression expression;

    /**
     * Tinh binh phuong.
     * @param expression ngoai le
     */
    public Square(Expression expression) {
        if (expression == null) {
            throw new IllegalArgumentException("null");
        }
        this.expression = expression;
    }


    /**
     * Tra ve chuoi cua phep tinh.
     *
     * @return chuoi cua phep tinh
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    /**
     * Tra ve ket qua cua phep tinh.
     *
     * @return ket qua cua phep tinh
     * @throws ArithmeticException ngoai le tinh toan
     */
    @Override
    public double evaluate() throws ArithmeticException {
        double num = expression.evaluate();
        return num * num;
    }
}
