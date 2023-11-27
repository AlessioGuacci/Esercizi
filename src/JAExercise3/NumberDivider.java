package JAExercise3;

public class NumberDivider {
    public static void main(String[] args) {
        int value = 6;
        System.out.println(numberDivider(value));
    }

    public static int numberDivider(int valueInput) {
        try {
            // Perform division
            int result = valueInput / 0;
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Something went wrong");
            return 0;
        }
    }
}