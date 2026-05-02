package ArrayBasic;

public class P19_UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};

        System.out.println(uniqueElement(arr));

    }

    private static int uniqueElement(int[] arr) {
        int res =0;
        for (int j : arr) {
            res ^= j;
        }
        return res;
    }
}
