package JAExercise4;
import java.lang.*;
import java.lang.reflect.Array;

public class ArrayDivider {
    public static void main(String[] args) {
        int[] array = {1,2,3,};
     arrayComponentDivider(array);
    }
    public static int arrayComponentDivider(int [] arrayInput){
        for (int i = 0; i < arrayInput.length;i++){
            try {
                int result = arrayInput[i + 10];
                System.out.println(result);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("that's out of bounds");
            }

            try {
                System.out.println(arrayInput[i] / 0);
            }catch (ArithmeticException e){
                System.out.println("cant divide");
            }
            }

        return 0;
    }
}
