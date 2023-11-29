package JAExercise7;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        HashSet <String> set = new HashSet<String>();
        set.add("element ");
        set.add("second element ");


        HashSet <String> modifiedHashSet = returnHashset(set);
        System.out.println("the size of the midfied set is " + modifiedHashSet.size());
        System.out.println("the contents of the set are" + modifiedHashSet);

    }
 public static HashSet <String> returnHashset (HashSet <String> input){
        Set <String> setInput= new HashSet<>();
        setInput.add("adding ");
        setInput.add("random ");
        setInput.add("Strings ");
        input.addAll(setInput);
        return input;
 }

}

