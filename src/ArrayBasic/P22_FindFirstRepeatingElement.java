package ArrayBasic;

import java.util.HashSet;

public class P22_FindFirstRepeatingElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,5,7,8,9};

        System.out.println(findFirstRepeatingElement(arr));
    }

    private static int findFirstRepeatingElement(int [] arr) {

        HashSet<Integer> set = new HashSet<>();

        for(int i:arr){
            if(set.contains(i)){
                return i;
            }
            else{
                set.add(i);
            }
        }

        return 0;
    }
}
