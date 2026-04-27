package ArrayBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P9_IntersectingElements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] arr1 ={2,3,6,7,8};
        List<Integer> li = intersectingElements(arr,arr1);

        System.out.println(li);
    }

    private static List<Integer> intersectingElements(int[] arr, int[] arr1) {

        HashSet<Integer > set = new HashSet<>();

        for(int i:arr){
            set.add(i);
        }
        HashSet<Integer > res = new HashSet<>();
        List<Integer> li = new ArrayList<>();
        for (int i:arr1){
            if(set.contains(i)){
                li.add(i);
            }
        }

        return li;

    }
}
