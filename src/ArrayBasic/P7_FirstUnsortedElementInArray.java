package ArrayBasic;

public class P7_FirstUnsortedElementInArray {
    public static void main(String[] args) {
        int [] arr = {1,2,4,6,6,9,8};

        int res = FirstUnsortedElementInArray(arr);

        System.out.println(res);
    }

    private static int FirstUnsortedElementInArray(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return  arr[i];
            }
        }


        return -1;

    }

}
