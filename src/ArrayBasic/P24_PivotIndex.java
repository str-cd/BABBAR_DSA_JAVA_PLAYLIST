package ArrayBasic;

public class P24_PivotIndex {
    public static void main(String[] args) {

        int [] arr = {1,7,3,6,5,6};

        System.out.println(pivotIndex(arr));
    }

    private static int pivotIndex(int[] arr) {

        int [] rightSum = new int [arr.length];
        int right =0;
        for(int i=arr.length-1;i>=0;i--){
            right+=arr[i];
            rightSum[i]=right;
        }

        int left =0;

        for(int i=0;i< arr.length;i++){
            left+=arr[i];
            if(left==rightSum[i]){
                return i;
            }
        }


        return 0;
    }
}
