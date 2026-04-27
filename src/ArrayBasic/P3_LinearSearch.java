package ArrayBasic;

public class P3_LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        int x =4;
        int index = linerSearch(arr,x);
        System.out.println(index);
    }

    private static int linerSearch(int[] arr, int x) {

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }

        return -1;
    }
}
