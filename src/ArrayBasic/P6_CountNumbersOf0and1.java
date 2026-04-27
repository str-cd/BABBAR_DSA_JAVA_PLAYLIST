package ArrayBasic;

import java.util.ArrayList;
import java.util.List;

public class P6_CountNumbersOf0and1 {
    public static void main(String[] args) {
        int [] arr ={1,0,1,1,0,0,1,0,0,0,0,1};
        List<Integer> res = CountNumbersOf0and1(arr);

        System.out.println("0 Elements : "+res.get(0) );
        System.out.println("1 Elements : "+res.get(1) );

    }

    private static List<Integer> CountNumbersOf0and1(int[] arr) {
        List<Integer> li = new ArrayList<>();
        int zeros=0;
        int ones=0;
        for(int i:arr){
            if(i==0){
                zeros++;
            }

            else{
                ones++;
            }
        }
        li.add(zeros);
        li.add(ones);

        return li;
    }
}
