package JAExercise9;

import java.util.HashSet;
import java.util.Iterator;

//ho rifatto tutto da capo, stavo interpretando male le domande e mi sono reso conto che era molto piu semplice del dovuto
//spero vada bene
public class HashSetMain {
    public static void main(String[] args) {
        Hashset();
    }
    public static void Hashset (){
        HashSet <String> newList = new HashSet<>();
        newList.add("iphone");
        newList.add("samsung");
        newList.add("nokia");
        String object = "nokia";
        Iterator <String> it = newList.iterator();
        while (it.hasNext()){
            if (newList.contains(object)){
                newList.remove(object);
                break;
            }
        }
        System.out.println(newList);
    }
}


