package JAExercise3;

public class NumberDivider {
    public static void main(String[] args) {

        int value = 6;
        try {
            System.out.println(numberDivider(value));
        } catch (ArithmeticException e){
            System.out.println("something went wrong");
        }
    }


    public static int numberDivider(int valueInput){
        return valueInput/0;
    }
}
