import java.util.ArrayList;

public class SubArrayWithGivenSum2 {
    public ArrayList<Integer> subArray(int[] arr, int n, int s){
        ArrayList<Integer> subArray = new ArrayList<>(2);
        int left =0;
        int right = 1;
        int sum = arr[0];
        while(left<right && right <= n){
            if(sum < s){
                sum = sum + arr[right];
                right++;
            }else if (sum > s){
                sum = sum - arr[left];
                left++;
            }else{
                subArray.add(left+1);
                subArray.add(right);
                return subArray;
            }
        }
        subArray.add(-1);
        return subArray;
    }
    public static void main(String[] args) {
        int[] arr ={135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82,28, 162,92, 196, 143, 28, 37 ,192, 5, 103, 154, 93, 183, 22, 117, 119, 96 ,48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        SubArrayWithGivenSum2 subArrayWithGivenSum2 = new SubArrayWithGivenSum2();
        ArrayList<Integer> subArray =  subArrayWithGivenSum2.subArray(arr, arr.length, 468);
        for(int index : subArray){
            System.out.println(index);
        }
    }
}
