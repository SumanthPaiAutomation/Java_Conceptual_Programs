package Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacters {
    public static void main(String[] args) {
        String str="fheiufefgefgvabbcccccd";
        Map<Character,Integer>mapper=new HashMap<>();
        for(char c : str.toCharArray()){
            if(mapper.containsKey(c)){
                mapper.put(c,mapper.get(c)+1);
            }else {
                mapper.put(c,1);
            }
        }
        System.out.println(mapper);
        for(Map.Entry x: mapper.entrySet()){
            if(x.getValue()==(Integer)3){
                System.out.println(x.getKey());
            }
        }
        //max num of occuring char
        char maxXhar=' ';
        Integer maxFreq=0;
        for(Map.Entry<Character,Integer> x : mapper.entrySet()){
            if(x.getValue()>maxFreq){
                maxFreq=x.getValue();
                maxXhar=x.getKey();

            }
        }
        System.out.println("The Most frequent character is "+ maxXhar + " with number of Occurence : "+maxFreq);

    }
}

//package Strings;
//
//public class LeastOccurringCharacterWithoutMap {
//    public static void main(String[] args) {
//        String str = "fheiufefgefgvabbcccccd";
//
//        // Assuming ASCII characters, create an array to store the frequency of each character
//        int[] frequency = new int[256]; // Assuming extended ASCII
//
//        // Count the frequency of each character
//        for (char c : str.toCharArray()) {
//            frequency[c]++;
//        }
//
//        // Find the least occurring character
//        char leastOccurringChar = ' ';
//        int minFrequency = Integer.MAX_VALUE;
//
//        for (int i = 0; i < frequency.length; i++) {
//            if (frequency[i] > 0 && frequency[i] < minFrequency) {
//                minFrequency = frequency[i];
//                leastOccurringChar = (char) i;
//            }
//        }
//
//        System.out.println("Least occurring character: " + leastOccurringChar);
//    }
//}

