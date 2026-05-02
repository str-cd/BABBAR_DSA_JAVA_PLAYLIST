package ArrayBasic;

public class P18_MissingNumber {
    public static void main(String[] args) {
        int [] arr ={0,1,2,3,5,6,7,8,9};

        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] arr) {

        int xor = 0;

        for(int i:arr){
            xor^=i;
        }

        int n= arr.length;
        for(int i=0;i<=n;i++){
            xor^=i;
        }
        return xor;

        // We Can do it but sum method as well (n(n+1)/2)
    }
}
