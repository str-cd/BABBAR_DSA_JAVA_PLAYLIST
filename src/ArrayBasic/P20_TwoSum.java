package ArrayBasic;

import java.util.ArrayList;
import java.util.List;

public class P20_TwoSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        List<Integer> res = twoSum(arr,10);

        System.out.println(res);
    }

    private static List<Integer> twoSum(int[] arr,int target) {
        List<Integer> li = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    li.add(i);
                    li.add(j);
                    break;
                }
            }
        }


        return li;

    }
}
