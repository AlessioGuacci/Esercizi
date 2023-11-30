package JAExercise8;

import java.util.HashSet;
import java.util.Set;

public class VerifyHashset {

    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);

        Integer a = 6;

        System.out.println(hashSetFunction(hashSet));
        System.out.println(hashSet.contains(a));
    }

    public static HashSet <Integer> hashSetFunction (HashSet <Integer> input){
        Set <Integer> setInput = new HashSet<>();
        setInput.add(1);
        setInput.add(2);
        setInput.add(3);
        input.addAll(setInput);
        return input;
    }
}
