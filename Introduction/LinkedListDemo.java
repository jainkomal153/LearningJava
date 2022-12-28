package Introduction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
 
    //  Drawback of using Array Lists:
    // if you have a list of 1000 items and want to remove a 40th indexed item, then java
    // has to move all the elements after 40th index to (their respective index-1) that might 
    // some time and memory. To overcome this LinkedLists are used.

    /*
        Linked Lists contains the reference of the previous element and the reference of the next element.
        Linked List: {[0, i[1]], [i[0], 1, [i[2]], [i[1], 2, i[3]], [i[2], 3]}
        Array List: {0,1,2,3}

        So, when you remove from the begining or add something in the begining, linkedlist just update
        the 2 references.

    */

    /***
     * Linked List is used when you want to add or remove at the begining of the list.
     * Array List is used when you want to add or remove at the end of the list. 
     * 
     */

     /***
      * LinkedList will be slow, if we have to remove or add at the end of the list as the compiler
        will have to traverse each node one by one and when it reaches at the end of the list, then 
        the new number/ list will add.
      * Array List will be slow if we have to add or remove at the begining of the list as the
        compiler will create new list and copy all the data from the old list and add 1 new element at the begining of the list.


        Linked lists will be more efficient in traversing only if we have the reference number.
        
        */

    public static void main(String[] args) {
        LinkedList<String> numbers = new LinkedList<String>();

        // Addition 

        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        numbers.add("6");

        // Size
        System.out.println("The size of the array is " + numbers.size());

        // Get
        System.out.println("\nThe number on index 2 is " + numbers.get(2) + "\n");

        //Iteration
        for (int i=0; i<=numbers.size()-1; i++){

            System.out.println("The number on index " + i + " is " + numbers.get(i));
        }
        // Remove
        numbers.remove(4);
        System.out.println("\n The size of the array is " + numbers.size() + "\n");
        // Iteration 
        for (String number : numbers) {

            System.out.println("The number on index " + numbers.indexOf(number) + " is " + number);
        }


        // As both Array and linked lists are type of lists, the below syntax can also be used.

        List<Integer> llist = new LinkedList<Integer>();
        List<Integer> alist = new ArrayList<Integer>();

        llist.add(1);
        llist.add(2);

        for (int number : llist) {

            System.out.println("The item on index " + llist.indexOf(number) + " is " + number);
        }

        System.out.println("\nsize of Array list before addition " + alist.size());
        alist.add(3);
        alist.add(4);

        for (int number : alist) {

            System.out.println("The item on index " + alist.indexOf(number) + " is " + number);
        }
    }


}



