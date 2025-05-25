public class Subtraction extends BinaryExpression {
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate() throws ArithmeticException {
        return left.evaluate() - right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
