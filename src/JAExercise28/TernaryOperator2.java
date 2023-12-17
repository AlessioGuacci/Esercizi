package JAExercise28;

public class TernaryOperator2 {
        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Valore: " + i);
                System.out.println(checkValue(i));
            }
        }

        private static String checkValue(int value) {
            String result = value % 5==0 ? "Fizzbuzz": "Buzz";
            return result;
        }
    }

