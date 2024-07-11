import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class SubArrayWithGivenSum {

    public ArrayList<Integer> subarraySum(int[] arr, int n, int s){
        ArrayList<Integer> subArray = new ArrayList<>(2);
        int left =0;
        int sum = arr[0];
        for(int i=1; i<=n; i++) {
            while(sum>s && left <i-1){
                sum = sum - arr[left];
                left++;
            }
            if(sum==s){
                subArray.add(left);
                subArray.add(i-1);
                return subArray;
            }
            if (sum < s) {
                sum = sum + arr[i];
            }
        }
        subArray.add(-1);
        return subArray;
    }


    public static void main(String[] args) {
//        int[] arr = {1,2,3, 7, 5};
        int[] arr ={135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82,28, 162,92, 196, 143, 28, 37 ,192, 5, 103, 154, 93, 183, 22, 117, 119, 96 ,48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
//        int[] arr ={135, 95, 104, 12, 123, 134};
        int s = 468;
        SubArrayWithGivenSum subArrayWithGivenSum = new SubArrayWithGivenSum();
        ArrayList<Integer> subArray = subArrayWithGivenSum.subarraySum(arr, arr.length, s);
        for(int index : subArray){
            System.out.println(index);
        }
    }
}
