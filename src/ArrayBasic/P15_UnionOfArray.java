package ArrayBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P15_UnionOfArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5};

        int [] arr2 ={2,5,6,7};

        List<Integer> li = unionOfArray(arr1,arr2);

        System.out.println(li);
    }

    private static List<Integer> unionOfArray(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for(int i:arr1){
            set.add(i);
        }

        for(int i:arr2){
            set.add(i);
        }

        return new ArrayList<>(set);

    }
}
