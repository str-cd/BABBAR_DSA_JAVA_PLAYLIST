package ArrayBasic;

public class P10_AlternateExtreme {

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7};

        AlternateExtreme(arr);
    }

    private static void AlternateExtreme(int[] arr) {

        int l=0;
        int r = arr.length-1;

        while(l<=r){
            if(l==r){
                System.out.println(arr[l]);
                l++;
            }
            else{
                System.out.println(arr[l++]);
                System.out.println(arr[r--]);
            }
        }
    }
}
