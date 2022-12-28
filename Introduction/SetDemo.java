package Introduction;

import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        /***
         * Lists and sets both are same, both contain a list of items but Sets contain a list of unique items.
         * List is of 2 types: Array List and Linked List. (Refer the ArrayListDemo and LinkedListDemo notes)
         * Set is of 3 types:  Hash set, Linked Hash Set and Tree Set.
         * 
         * Hash set: Doesn't maintain any order. (displays items in random order).
         * Linked Hash Set: Maintains the order as they were added.
         * Tree Set: Maintains the order of natural sorting. eg.: 1,2,3,4.... ; alphabetical order.
         *  
         */
        
        List<String> list = new ArrayList<String>();
        list.add("5");
        list.add("3");
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("1");
        list.add("3");

        System.out.println("This is the array list. It will display the same order as added with the duplicate elements");
        for(String item: list){
            System.out.println(item);
        }


        Set<String> set = new HashSet<String>();
        set.add("5");
        set.add("3");
        set.add("1");
        set.add("2");
        set.add("4");
        set.add("1");
        set.add("3");
        

        System.out.println("\nThis is the Hash Set. It will display random order of unique elements");
        for(String item: set){
            System.out.println(item);
        }


        Set<String> lhset = new LinkedHashSet<String>();
        lhset.add("5");
        lhset.add("3");
        lhset.add("1");
        lhset.add("2");
        lhset.add("4");

        System.out.println("\nThis is the Linked Hash Set. It will display the same order as they were added.");
        for(String item: lhset){
            System.out.println(item);
        }


        Set<String> tset = new TreeSet<String>();
        tset.add("5");
        tset.add("3");
        tset.add("1");
        tset.add("2");
        tset.add("4");

        System.out.println("\nThis is the Tree Set. It will display the natural Sorting/ Alphabetical order.");
        for(String item: tset){
            System.out.println(item);
        }



    }
    
}
