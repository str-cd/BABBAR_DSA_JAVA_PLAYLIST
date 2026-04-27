package ArrayBasic;

public class P4_MaxElementInArray {
    public static void main(String[] args) {
        int [] arr = {5,6,2,1,8,9,4};
        int res = findMax(arr);

        System.out.println(res);

    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i:arr){
            max =Math.max(max,i);
        }

        return max;
    }
}
