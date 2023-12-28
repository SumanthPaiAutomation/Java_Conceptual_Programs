package Random;

import java.util.*;

public class FrequencyCharacterHashMap {

    public static  void main(String[] args){
        String stringer="Welllcommmeee";
        String strarr[]=stringer.split("");
        Map<String,Integer> mapper=new HashMap<>();
        //Integer count=0;
        for(String eachString : strarr){
            if(mapper.containsKey(eachString)){
                mapper.put(eachString,mapper.get(eachString)+1);

            }else {
                mapper.put(eachString,1);
            }
        }

        System.out.println(mapper);
        List<Integer>newlIst=new ArrayList<>();
        Integer maxValue=0;
        for(Map.Entry<String,Integer> eachEntry : mapper.entrySet()){
            newlIst.add(eachEntry.getValue());

        }
        for(Integer eachInt : newlIst){
            if(eachInt>maxValue){
                maxValue=eachInt;
            }

        }
        for(Map.Entry<String,Integer> sortMap : mapper.entrySet()){
            if(sortMap.getValue().equals(maxValue)){
                System.out.println("The Highest Frequency is for the letter : "+sortMap.getKey());
            }
        }



    }


}
