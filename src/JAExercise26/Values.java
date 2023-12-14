package JAExercise26;

import java.math.BigDecimal;
import java.math.RoundingMode;

//non ho capito se dovevo fare enum con una sola operazione o utilizando una sola operazione tra le varie opzioni
//ho fatto cosi forse anche piu complicato del dovuto

public class Values {
    public static void main(String[] args) {
        BigDecimal value1 = BigDecimal.valueOf(2.5);
        BigDecimal value2 = BigDecimal.valueOf(5.6);
        OperazioneAritmetica operation = OperazioneAritmetica.DIVISION;
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(operation);
        System.out.println( perfromOperation(value1, value2, operation));
    }

    public static BigDecimal perfromOperation(BigDecimal value1Input, BigDecimal value2Input, OperazioneAritmetica operation) {
        switch (operation) {
            case ADDITION:
                return value1Input.add(value2Input);
            case SUBTRACTION:
                return value1Input.subtract(value2Input);
            case MULTIPLICATION:
                return value1Input.multiply(value2Input);
            case DIVISION:
                if(value2Input.compareTo(BigDecimal.ZERO) !=0){
                    return value1Input.divide(value2Input, 10, RoundingMode.HALF_UP);
            } else{
                    throw new ArithmeticException("Division by 0");
                }
            case MAX:
                return value1Input.max(value2Input);
            case MIN:
                return value1Input.min(value2Input);
            default:
                throw new IllegalArgumentException("Invalid Operation");
        }
    }
}
