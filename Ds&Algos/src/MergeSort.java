import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public void mergeSort(ArrayList<Integer> numbers, int head, int tail){
        if(head==tail){
            return;
        }
        int mid= (head+tail)/2;
        mergeSort(numbers, head, mid);
        mergeSort(numbers, mid+1, tail);
        merge(numbers,head, mid, tail);
    }

    public void merge(ArrayList<Integer> numbers, int head, int mid, int tail){
        int lengthFromHeadToMid = (mid-head)+1;
        int lengthFromMidToTail = tail-mid;

        ArrayList<Integer> array1 = new ArrayList<>(lengthFromHeadToMid);
        for (int i=0; i<lengthFromHeadToMid; i++) {
            array1.add(numbers.get(i+head));
        }
        ArrayList<Integer> array2 = new ArrayList<>(lengthFromHeadToMid);
        for (int i=0; i<lengthFromMidToTail; i++) {
            array2.add(numbers.get(i+mid+1));
        }
        int p1=0, p2=0, i=head;
        while((p1<lengthFromHeadToMid) && (p2<lengthFromMidToTail)){
            if(array1.get(p1) <= array2.get(p2)){
                numbers.set(i, array1.get(p1));
                p1++;
            }else{
                numbers.set(i, array2.get(p2));
                p2++;
            }
            i++;
        }
        while(p1<lengthFromHeadToMid){
            numbers.set(i, array1.get(p1));
            p1++;
            i++;
        }
        while(p2<lengthFromMidToTail){
            numbers.set(i, array2.get(p2));
            p2++;
            i++;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(8,7,6,5,4,3,2,1,0));
        MergeSort mergeSort= new MergeSort();
        mergeSort.mergeSort(numbers, 0, numbers.size()-1);
        System.out.println(numbers);
    }
}
