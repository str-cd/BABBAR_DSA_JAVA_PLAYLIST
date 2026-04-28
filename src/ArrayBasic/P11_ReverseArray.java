package ArrayBasic;

public class P11_ReverseArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};

        reverse(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void reverse(int[] arr) {

        int l =0;
        int r = arr.length-1;

        while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }


}
