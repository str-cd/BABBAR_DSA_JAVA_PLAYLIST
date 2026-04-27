package ArrayBasic;

public class P2_MultiplyEachElementBy10 {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*10;
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
