package ArrayBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P14_NumberWithHighestAndLowestFreq {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,4,4,4,4,4,4,4,4,5,5,5,5,5,1,1,1,1,2,4};

        List<Integer> res =numberWithHighestAndLowestFreq(arr);

        for(int i:res){
            System.out.println(i);
        }
    }

    private static List<Integer> numberWithHighestAndLowestFreq(int[] arr) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int max = -1;
        int maxValue =-1;

        int min = Integer.MAX_VALUE;
        int minValue =-1;
        for(int i:map.keySet()){
            if(max<map.get(i)){
                max = map.get(i);
                maxValue =i;
            }
            if(min>map.get(i)){
                min = map.get(i);
                minValue=i;
            }
        }

        List<Integer> li = new ArrayList<>();

        li.add(maxValue);
        li.add(minValue);

        return li;

    }
}
