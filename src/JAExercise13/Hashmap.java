package JAExercise13;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {


        Map<String,String> listItems = new HashMap<>();
        listItems.put("food","pizza");
        listItems.put("drink", "pepsi");
        listItems.put("dessert", "cheesecake");
        System.out.println(listItems);


        Map<String,String>listItems1 = Map.of("food", "pizza", "drink", "pepsi",
                "dessert", "cheesecake");
        System.out.println(listItems1);

        Map<String,String>listItems2= Map.ofEntries(
        new AbstractMap.SimpleEntry<>("food", "pizza"),
        new AbstractMap.SimpleEntry<>("drink", "pepsi"),
                new AbstractMap.SimpleEntry<>("dessert", "cheesecake")
        );
        System.out.println(listItems2);

    }
}
