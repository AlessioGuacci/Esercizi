package JAExercise5;

public class IsItNull {
    public static void main(String[] args) {
        Integer numerator = 10;
        Integer denominator = null;

        try {
            Integer result = performDivision(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            System.out.println("Numerator or denominator is null.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero occurred.");
        }

        numerator = null;
        denominator = 5;

        try {
            Integer result = performDivision(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (NullPointerException e) {
            System.out.println("Numerator or denominator is null.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero occurred.");
        }
    }

    public static Integer performDivision(Integer numerator, Integer denominator) {
        if (numerator == null || denominator == null) {
            throw new NullPointerException("Numerator or denominator is null.");
        }

        return numerator / denominator;
    }
}



