package JAExercise14;

import java.util.*;

public class HashmapOrder {
    public static void main(String[] args) {
        Map<Integer, String> cars = new HashMap<>();
        cars.put(2, "Ferrari");
        cars.put(1, "Lamborghini");
        cars.put(4, "Ford");
        cars.put(3, "Honda");

        System.out.println(cars);

        List <Integer> carsSorted= new ArrayList<>(cars.keySet());

        Collections.sort(carsSorted);
        for(Integer key: carsSorted){
            String value = cars.get(key);
            System.out.println(key + value);
        }
    }

}

