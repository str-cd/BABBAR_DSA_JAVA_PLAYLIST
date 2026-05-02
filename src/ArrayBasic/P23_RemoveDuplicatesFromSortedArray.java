package ArrayBasic;

public class P23_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,5};
        int res = RemoveDuplicatesFromSortedArray(arr);

        System.out.println(res);
    }

    private static int RemoveDuplicatesFromSortedArray(int[] arr) {

        int l=0;
        int r=1;

        while(r<arr.length){
            if(arr[l]==arr[r]){
                r++;
            }
            else{
                arr[l+1]=arr[r];
                l++;
            }
        }

        return l+1;


    }
}
