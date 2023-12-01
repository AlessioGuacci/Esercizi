package JAExercise9;

import java.util.HashSet;
import java.util.Set;

//cercato un po online ma ho mezzo impazzito per questo esercizio XD
public class HashSetMain {
    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();
        hashSet = hashSetFunction(hashSet);

        MyObject myObject= new MyObject();
        myObject.setA(1);
        myObject.setB(2);
        myObject.setC(3);

        iteratorHashSets(hashSet, myObject);
        System.out.println("hashset after removing elements would look like: ");
        System.out.println(hashSet);
    }

    public static HashSet <Integer> hashSetFunction (HashSet <Integer> input){
        Set <Integer> setInput = new HashSet<>();
        setInput.add(1);
        setInput.add(2);
        setInput.add(3);
        input.addAll(setInput);
        return input;
    }

public static void iteratorHashSets(HashSet <Integer> hashSetInput, MyObject obj) {
    hashSetInput.removeIf(element -> element.equals(obj.getA()));
    hashSetInput.removeIf(element-> element.equals(obj.getB()));
    hashSetInput.removeIf(element-> element.equals(obj.getC()));
}

    static class MyObject {

        private Integer a;
        private Integer b;
        private Integer c;

        public void setA(Integer a) {
            this.a = a;
        }

        public void setB(Integer b) {
            this.b = b;
        }

        public void setC(Integer c) {
            this.c = c;
        }

        public Integer getA() {

            return a;
        }

        public Integer getB() {
            return b;
        }

        public Integer getC() {
            return c;
        }
    }
}
