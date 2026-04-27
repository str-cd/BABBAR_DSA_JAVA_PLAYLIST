package ArrayBasic;

import java.util.ArrayList;
import java.util.List;

public class P5_SumOfPositiveAndNegativeNumber {
    public static void main(String[] args) {
        int [] arr = {1,-1,2,3,-4,-8,9,10};

        List<Integer> res = sumOfPosNdNeg(arr);

        System.out.println("Sum Of Positive Elements : "+res.get(0) );
        System.out.println("Sum Of Negative Elements : "+res.get(1) );
    }

    private static List<Integer> sumOfPosNdNeg(int[] arr) {

        List<Integer> li = new ArrayList<>();
        int posSum=0;
        int negSum=0;
        for(int i:arr){
            if(i<0){
                negSum+=i;
            }

            else{
                posSum+=i;
            }
        }
        li.add(posSum);
        li.add(negSum);

        return li;
    }
}
