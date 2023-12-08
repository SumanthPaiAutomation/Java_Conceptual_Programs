package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        //sort the array and just compare first and last words , since any other word included will got to first position ex: Circle
            String [] strArray={"Cluster","Club","Clumsy","Clue","Clutch"};
            String larPrefix="";
            Arrays.sort(strArray);
            char[] first=strArray[0].toCharArray();
            char[] last = strArray[strArray.length-1].toCharArray();
            for(char c : first){
                for(char d : last){
                    if(c==d){
                        larPrefix+=c;
                    }
                }
            }
        System.out.println(larPrefix);
    }
}
