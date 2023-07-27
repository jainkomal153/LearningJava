import java.util.LinkedList;

public class SortAnArray {

    public void sort(int[] a, int n){
        int left=0;
        int right=n-1;
        int mid = left ;
        int temp;

        while(mid<=right){
            if(a[mid] == 0){
                temp = a[mid];
                a[mid] = a[left];
                a[left] = temp;
                left++;
                mid++;
            }
            else if(a[mid] == 2){
                temp = a[mid];
                a[mid] = a[right];
                a[right] = temp;
                right--;
            }
            else{
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a ={2};
        SortAnArray sortAnArray = new SortAnArray();
        sortAnArray.sort(a, a.length);
        for(int num : a){
            System.out.print(num + " ");
        }
    }
}
