package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringBasics {
    public static void main(String[] args) {
        String str1="hello world";
        String str2="Hello world 2";
        String str3=str1+" and "+str2;
        String str4 = str1+" and ".concat(str2);
        System.out.println(str3);
        System.out.println("The string using concat "+str4);

        //Java Program to count the total number of characters in a string
        System.out.println("The length of charatcters in a string "+str2.trim().length());

        //Java Program to print frequency of chars using Collections
        List<Character> charList = new ArrayList<>();
        String strfreq="fheiufefgefgvabbcccccd";
        for(char c : strfreq.toCharArray()){
            charList.add(c);
        }

        for(Character c : strfreq.toCharArray()){
            int freq= Collections.frequency(charList,c);
            System.out.println("frquency of " +c +" is " +freq);

        }

        //Java Program to count the total number of punctuation characters exists in a String
        String puncString = "hi,how are you. I am fine.";
        int puncCount=0;
        for(Character c : puncString.toCharArray()){
            if(c==','||c=='.'){
                puncCount+=1;
            }
        }
        System.out.println("Number of punctuations "+puncCount);

        //Java Program to count the total number of vowels and consonants in a string
        String strvow="just looking like a wow";
        String vowels="aeiou";
        int vowelCount=0;
        int consCount=0;
        for(char d : strvow.trim().toCharArray()){
            if(vowels.indexOf(d)>-1){
                vowelCount+=1;
            }else {
                consCount+=1;
            }
        }
        System.out.println("vowel count is "+vowelCount);
        System.out.println("cons count is "+ (strvow.length()-vowelCount));

        //

    }






}
