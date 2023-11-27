public class JAExercise5 {
    public static void main(String[] args) {
        Integer numerator= 5;
        Integer denominator= null;
      try {
          System.out.println(isItNull(numerator, denominator));
      }catch (NullPointerException e){
          System.out.println("one of the values is null");
      }

      }

    public static Integer isItNull(Integer numeratorInput, Integer denominatorInput){
        if(numeratorInput== null || denominatorInput== null){
            System.out.println("error, something went wrong");
        }
        return numeratorInput / denominatorInput;
    }
}

