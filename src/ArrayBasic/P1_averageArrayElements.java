package ArrayBasic;

public class P1_averageArrayElements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        double average = (double) sum /arr.length;
        System.out.println(average);
    }
}

// Time Complexity = O(n)
// Space Complexity =O(1)
