public class ExpressionTest {

    public static void main(String[] args) {
        // Represents the expression: (10 + (5 * 2))^2
        Expression e1 = new Square(
                new Addition(
                        new Numeral(10),
                        new Multiplication(
                                new Numeral(5),
                                new Numeral(2)
                        )
                )
        );

        // Represents the expression: (10 / (4 - 2))
        Expression e2 = new Division(
                new Numeral(10),
                new Subtraction(
                        new Numeral(4),
                        new Numeral(2)
                )
        );

        // Represents division by zero: 1 / 0
        Expression e3 = new Division(new Numeral(1), new Numeral(0));


        try {
            System.out.println("Expression 1: " + e1); // ((10 + (5 * 2)))^2
            System.out.println("Result 1: " + e1.evaluate());     // 400.0

            System.out.println("\nExpression 2: " + e2); // (10 / (4 - 2))
            System.out.println("Result 2: " + e2.evaluate());     // 5.0

            System.out.println("\nExpression 3: " + e3); // (1 / 0)
            System.out.println("Result 3: " + e3.evaluate());     // This will throw an exception

        } catch (ArithmeticException ae) {
            System.err.println("\nError evaluating expression: " + ae.getMessage());
        } catch (IllegalArgumentException iae) {
            System.err.println("\nError creating expression: " + iae.getMessage());
        }
    }
}