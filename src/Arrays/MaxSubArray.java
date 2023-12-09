package Arrays;

public class MaxSubArray {
    public static int maxSumSubArray(int[]arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(MaxSubArray.maxSumSubArray(new int[]{-1,2,-3,4,5}));
    }
}
