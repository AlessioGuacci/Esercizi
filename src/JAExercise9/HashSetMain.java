package JAExercise9;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//ho fatto tutto solo prometto solo avevi ragione meglio vede obbietivo per obbietivo
public class HashSetMain {
    public static void main(String[] args) {
        String a = "this is string";
        String obj = new String(a);
        HashSet hashSet= new HashSet<>();
        fillUp(hashSet);
        System.out.println(hashSet);
        System.out.println(comparison(hashSet,obj));


    }
    public static HashSet <String> fillUp (HashSet<String> hashSetInput){
        Set <String> setInput = new HashSet<>();
        setInput.add("this is string");
        hashSetInput.addAll(setInput);
        return hashSetInput;
    }
    public static HashSet<String> comparison (HashSet <String> hashSetInput, String objInput){
       for (String i : hashSetInput){
           if (Objects.equals(i, objInput)){
               hashSetInput.remove(objInput);
           }
       }
       return hashSetInput;
    }
}


