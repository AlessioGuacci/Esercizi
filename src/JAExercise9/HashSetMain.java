package JAExercise9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//fatto sempre solo ma non trovavo la syntax giusto quindi ho messo un po
public class HashSetMain {
    public static void main(String[] args) {
        String a = "this is string";
        String obj = a;
        HashSet hashSet= new HashSet<>();
        hashSet.add("this is new string");
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
        Iterator <String> it = hashSetInput.iterator();
        while (it.hasNext()){
            String contents = it.next();
            if (contents.equals(objInput)){
                it.remove();
                break;
            }

           }
        return hashSetInput;
    }

}


