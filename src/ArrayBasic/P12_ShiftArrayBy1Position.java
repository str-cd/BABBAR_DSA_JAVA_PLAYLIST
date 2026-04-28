package ArrayBasic;

public class P12_ShiftArrayBy1Position {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};

        ShiftArrayBy1Position(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void ShiftArrayBy1Position(int[] arr) {

        int temp =arr[arr.length-1];

        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
                arr[i]=temp;
                break;
            }
            arr[i]=arr[i-1];
        }
    }
}
