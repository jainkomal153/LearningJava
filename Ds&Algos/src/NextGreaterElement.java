import java.util.*;

public class NextGreaterElement {

    public int nextGreaterElement(ArrayList<Integer> numbers, int number){
        int i=0;
        while (i<numbers.size()) {
            if(numbers.get(i)==number){
                int j= i+1;
                while(j<numbers.size()){
                   if(numbers.get(j)>number){
                       return numbers.get(j);
                   }
                   j++;
               }
            }
              i++;
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,5,2,25));
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        for (int element: numbers) {
            System.out.println(element + " : " + nextGreaterElement.nextGreaterElement(numbers, element));
        }
    }
}
