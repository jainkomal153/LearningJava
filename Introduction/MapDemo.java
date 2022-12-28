package Introduction;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapDemo {


    /***
     * Maps are different from Lists and Sets. They store elements with keys and Values and
     * can be retrieved using the key insted of index.
     * In Maps, keys can't be duplicated ie. unique keys but the values can be dupliacted.
     * If trying to duplicate the key with a different value, it will overwrite the value.
     * Key points the value that's why value can be accessed using the key.
     * Maps store the entry set as well as key set. 
     * 
     * Maps are of 3 types (Similar to sets): Hash Maps, linked Hash Maps & Tree Maps.
     * Hash map: Doesn't maintain any order. (displays items in random order). Always use Hash maps 
     * as they are fast as they don't have any burden on it.
     * Linked Hash map: Maintains the order as they were added. If you want to maintain the order in which they
     * are added, use linked hash map.
     * Tree map: Maintains the order of natural sorting. eg.: 1,2,3,4.... ; alphabetical order. If you wanted to maintain
     * natural sorting order use tree map.
     * 
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String> ();

        map.put(1, "G");
        map.put(4, "H");
        map.put(7, "Z");
        map.put(10, "R");

        System.out.println(map.get(2));
        // This will display null as it is not added yet.

        map.put(2, "O");
        System.out.println(map.get(2));

        

        System.out.println("\nThis is Hash Map. It will display a random order");

        // Iteration using the entry set:
        System.out.println("\nIteration using the entry Set");
        for(Map.Entry<Integer, String> item: map.entrySet()){

            int key = item.getKey();
            String value = item.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Iteration using the key set:
        System.out.println("\nIteration using the key Set");
        for(Integer item: map.keySet()){

            String value = map.get(item);
            System.out.println("Key: " + item + ", Value: " + value);
        }



        System.out.println("\nThis is Linked Hash Map. It will display the order as they were added");
    
        Map<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
        lhmap.put(1, "G");
        lhmap.put(4, "H");
        lhmap.put(7, "Z");
        lhmap.put(10, "R");
        lhmap.put(2, "O");

        for(Map.Entry<Integer, String> item: lhmap.entrySet()){

            int key = item.getKey();
            String value = item.getValue();
            System.out.println("Key: " + key + ", Value: " + value);

        }

        System.out.println("\nThis is Tree Map. It will display the natural sorting order");
    
        Map<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(1, "G");
        tmap.put(4, "H");
        tmap.put(7, "Z");
        tmap.put(10, "R");
        tmap.put(2, "O");

        for(Map.Entry<Integer, String> item: tmap.entrySet()){

            int key = item.getKey();
            String value = item.getValue();
            System.out.println("Key: " + key + ", Value: " + value);

        }
    
    }
    
}
