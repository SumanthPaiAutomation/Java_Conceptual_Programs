package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicsList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Brown");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        for(String eachString : colors){
            System.out.print(eachString+" ");
        }
        Collections.sort(colors);
//        Collections.reverse();
//        Collections.binarySearch();
//        Collections.copy();
//        Collections.swap();
        System.out.println(colors);
        System.out.println(colors.contains("Green"));
        //////// arraylist to array
        String arr[]= colors.toArray(new String[0]);
//        Arrays.sort(arr);
//        Arrays.binarySearch();
//        Arrays.compare();
        /////// array to array list
        List<String> exlist= Arrays.asList(arr);

        System.out.println(exlist);
    }
}
