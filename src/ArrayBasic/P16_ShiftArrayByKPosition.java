package ArrayBasic;

public class P16_ShiftArrayByKPosition {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        int k=3;

        ShiftArrayByKPosition(arr,k);

        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    private static void ShiftArrayByKPosition(int[] arr, int k) {

        int[] res = new int [arr.length];

        for(int i=0;i<arr.length;i++){
            int index = (i+k)%arr.length;
            res[i] = arr[index];
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=res[i];
        }
    }
}
