package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNonRepeat {
    public static int singleNonRepeat(int[]arr){
        int num=0;
        Integer[]arrInt=new Integer[arr.length];
        HashMap<Integer,Integer>mapper=new HashMap<>();
        int i=0;
        for(int c : arr){
            arrInt[i]=c;
            i++;
        }
        for(Integer c: arrInt){
            if(mapper.containsKey(c)){
                mapper.put(c,mapper.get(c)+1);
            }else {
                mapper.put(c,1);
            }
        }
        for(Map.Entry<Integer,Integer> x : mapper.entrySet()){
            if(x.getValue()==1){
                num=x.getKey();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Single non repeated number in an array is : "+ SingleNonRepeat.singleNonRepeat(new int[]{1,2,3,44,1,2,3}));
    }
}
