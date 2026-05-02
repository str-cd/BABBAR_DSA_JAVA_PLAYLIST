package ArrayBasic;

import java.util.HashMap;

public class P13_ModeOfArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,3,4,4,5,5,5,5,5,1,1,1,2,4};

        System.out.println(modeOfArray(arr));

    }

    private static int modeOfArray(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int max = -1;
        int res =-1;

        for(int i:map.keySet()){
            if(max<map.get(i)){
                max = map.get(i);
                res =i;
            }
        }

        return res;
    }

}
