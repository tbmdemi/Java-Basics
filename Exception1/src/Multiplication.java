public class Multiplication extends BinaryExpression {
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    @Override
    public double evaluate() throws ArithmeticException {
        return left.evaluate() * right.evaluate();
    }
}
