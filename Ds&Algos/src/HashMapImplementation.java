import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {

    public Map<Integer, Integer> findUniqueNumber(ArrayList<Integer> numbers){
        Map<Integer, Integer> uniqueNum = new HashMap<Integer, Integer>(numbers.size());

        for(int element: numbers){
            if(uniqueNum.containsKey(element)){
                uniqueNum.remove(element);
            }else{
                uniqueNum.put(element, element);
            }
        }
        return uniqueNum;
    }

    public int findUniqueNumberNew(ArrayList<Integer> numbers) {
        int value = 0;
        for (Integer number : numbers) {
            value = value ^ number;
        }
        return value;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4));
        HashMapImplementation hashMapImplementation= new HashMapImplementation();
        System.out.println(hashMapImplementation.findUniqueNumber(numbers).keySet());

        System.out.println(hashMapImplementation.findUniqueNumberNew(numbers));
    }
}
