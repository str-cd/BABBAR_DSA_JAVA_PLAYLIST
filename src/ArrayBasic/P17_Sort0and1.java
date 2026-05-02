package ArrayBasic;



public class P17_Sort0and1 {

    public static void main(String[] args) {
        int [] arr = {1,1,0,0,1,1,1,0};

        sort0and1(arr);

        for(int i:arr){
            System.out.println(i);
        }
    }

    private static void sort0and1(int[] arr) {

        int l=0;
        int r=arr.length-1;

        while(l<=r){
            if(arr[l]==1 &&arr[r]==0){
                arr[l]=0;
                arr[r]=1;
            }

            if(arr[l]==0){
                l++;
            }
            if(arr[r]==1){
                r--;
            }
        }


    }


}
