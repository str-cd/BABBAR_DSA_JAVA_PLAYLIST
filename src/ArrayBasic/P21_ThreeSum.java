package ArrayBasic;

import java.util.ArrayList;
import java.util.List;

public class P21_ThreeSum {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int target=13;
        List<List<Integer>> res = threeSum(arr,target);

        System.out.println(res);
    }

    private static List<List<Integer>> threeSum(int[] arr,int target) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                       List<Integer> li = new ArrayList<>();
                        li.add(i);
                        li.add(j);
                        li.add(k);
                        res.add(li);
                    }
                }

            }
        }


        return res;

    }
}
