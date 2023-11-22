package JAExercise1;

import javax.swing.*;
import java.util.InputMismatchException;

public class Funzione {
    public static void main(String [] Args){
    int lowerLimit=1;
    int upperLimit=10;
    int rangeNumber= 12;


      try {
          boolean result = rangeChecker(lowerLimit, upperLimit, rangeNumber);
          System.out.println(result);
      } catch (IllegalArgumentException e){
          System.out.println(e.getMessage());
      }
    }


    public static boolean rangeChecker (int lowerInput, int higherInput, int rangeInput){
        if (rangeInput> lowerInput && rangeInput<higherInput){
            return true;
        } else {
            throw new IllegalArgumentException("Number is not found between range");
        }

    }

}