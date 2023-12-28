package Random;

//import java.net.SocketOption;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TwoPairSum {
//    public static void main(String[] args) {
//        int target = 15;
//        int arr[] = {1, 2, 3, 4, 5, 6, 9, 8, 7, 24, 19, 10};
//        //5,10  6,9  8,7
//        List<int[]> twoPairList = new ArrayList<>();
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (Math.abs(target - arr[j]) == arr[i]) {
//                    int pairArr[] = {arr[i], arr[j]};
//                    twoPairList.add(pairArr);
//                }
//            }
//        }
//        for (int[] eachArr : twoPairList) {
//            for(Integer eachEle:eachArr){
//                System.out.print(eachEle.toString()+" ");
//            }
//            System.out.println();
//        }
//    }
//}

//

import java.util.HashMap;
import java.util.Map;

public class TwoPairSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 9, 8, 7, 24, 19, 10};
        int target = 15;

        int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null; // No two numbers found
    }
}


