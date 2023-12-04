package JAExercise12;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FruitMain {
    public static void main(String[] args) {
        Fruit fruit1= new Fruit("Apple");
        Fruit fruit2= new Fruit("Orange");
        Fruit fruit3= new Fruit("Pear");

        List<Fruit> fruitList= new LinkedList<>(Arrays.asList(fruit1,fruit2,fruit3));
        System.out.println(fruitList);

        Fruit fruit4= new Fruit("Banana");
        Fruit fruit5= new Fruit("Watermelon");
        fruitList.addFirst(fruit4);
        fruitList.addLast(fruit5);
        System.out.println(fruitList);
    }
}
