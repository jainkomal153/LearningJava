import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

    public int search(ArrayList<Integer> sortedArray, int numberToSearch) {
        int leftIndex = 0, rightIndex = sortedArray.size() - 1;

        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (numberToSearch == sortedArray.get(midIndex)) {
                return midIndex;
            } else if (numberToSearch > sortedArray.get(midIndex)) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        Collections.addAll(sortedArray, 18, 20, 29, 34, 42, 66, 67, 81, 85, 93, 99);

        BinarySearch binarySearch = new BinarySearch();

        for (int numberToSearch : sortedArray) {
            System.out.println("Number To Search : " + numberToSearch);
            System.out.println("Found at Index : " + binarySearch.search(sortedArray, numberToSearch));
        }

    }
}