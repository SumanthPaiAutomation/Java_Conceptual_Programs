package Arrays;

import java.util.HashMap;
import java.util.Map;

public class MissinNumbersMap {

    public static void main(String[] args) {
        // Convert int[] to Integer[] in a single line
        //Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
        Integer arr[]={1,2,3,4,5,6,7,1,2};
        Integer arr2[]={1,2,3,4,5,6,7,8,9};
        HashMap<Integer,Integer>initFreq=new HashMap<>();
        for(Integer c : arr){
            if(initFreq.containsKey(c)){
                initFreq.put(c,initFreq.get(c)+1);
            }else {
                initFreq.put(c,1);
            }
        }
        System.out.println("Initial frequencies : " + initFreq);
        //lastly retrieve all elements with freq more than or equal to -1.
        for(Integer x : arr2){
            if(initFreq.containsKey(x)){
                continue;
            }else {
                initFreq.put(x,-1);
            }
        }
        System.out.println("After freq reduction : " + initFreq);
        for(Map.Entry<Integer,Integer> values : initFreq.entrySet()){
            if(values.getValue()==-1){
                System.out.println("Missing number is : " +values.getKey());
            }
        }

    }
}
