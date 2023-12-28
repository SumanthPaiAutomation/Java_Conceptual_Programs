package Random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoPairs {
    public static void main(String[] args) {
        int []arr={2,3,6,7,1,4};
//        int [] resaRR=new TwoPairs().twoSumWithoutHash(arr,5);
//        for(int i=0;i<resaRR.length;i++){
//            System.out.println(resaRR[i]+" ");
//        }
        //System.out.println("pairs : "+arr[resaRR[0]]+" "+arr[resaRR[1]]);
        new TwoPairs().twoSumWithoutHash(arr,5);
    }

    public int[] twoPaira(int [] arr, int target){
        int n= arr.length;
        int result[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(target-arr[i])){
                result[1]=i;
                result[0]=map.get(target-arr[i]);
                return result;
            }
            map.put(arr[i],i);
        }
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
    public void twoSumWithoutHash(int []arr,int target){
        List<int[]>allPairs=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    int newArr[]={arr[i],arr[j]};
                    allPairs.add(newArr);
                }
            }
        }
        for(int[] eachEle:allPairs){
            for(int i=0;i<eachEle.length;i++){
                System.out.print(eachEle[i]+" ");
            }
        }
    }
}
