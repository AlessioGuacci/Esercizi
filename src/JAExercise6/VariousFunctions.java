package JAExercise6;

public class VariousFunctions {
    public static void main(String[] args) {
    int a= 5;
    int b= 6;

        //questi sotto sarebbe Autoboxing giusto? chiedo perche ho visto un video online per linglese.
    Integer d = 7;
    Double e = 3.14;
    Character f = '$';

    //questi sotto sarebbe Unboxing
    if(d== 7){
        System.out.println("Integer is true");
    }
    if (e== 3.14){
        System.out.println("Double is true");
    }

    if (f=='$'){
        System.out.println("Character is true");
    }

    //i vari funzioni richiesti e stampati

    Character c = 'c'; //potevo pure inserire direttamente senza creare sto variabile
        System.out.println(addInts(a,b));
        System.out.println(printChar('a'));
        System.out.println(integerAdder(6,7));
        System.out.println(printCharacter(c));
    }
    public static int addInts(int firstInt, int secondInt){
        return firstInt + secondInt;
    }

    public static char printChar(char charInput){
        return charInput;
    }

    public static Integer integerAdder(Integer firstInteger, Integer secondInteger){
        return firstInteger + secondInteger;
    }

    public static Character printCharacter(Character characterInput){
        return characterInput;
    }
}
