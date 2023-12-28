package Java8Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamBasics {


    //Problem: Given a list of names,
    // create a new list containing only the names that start
    // with a vowel and convert them to uppercase.

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("sam", "pam", "jim", "angelina", "Brad Pitt");
        String vowels = "aeiou";
        List<String> startWithVowel = nameList.stream().filter(eachName -> vowels.indexOf(eachName.charAt(0)) >= 0).collect(Collectors.toList());

        System.out.println(startWithVowel);

        /////////////////////////////////////////

        List<Integer> intlister= Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> sum = intlister.stream().reduce((a,b)->a+b);
        System.out.println(sum.get());
        ///////////////////////////////////////////


        List<Integer> avglister= Arrays.asList(1,2,3,4,5,6);
        double avergae= avglister.stream().mapToInt(eachInt->eachInt).average().getAsDouble();
        System.out.println(avergae);
        ///////////////////////////////////////////

        //take averages of those numbers whose sqaure is greater than 100
        List<Integer> sqlister= Arrays.asList(8,9,10,11,22,33,44,55,66);
        double result =sqlister.stream()
                .map(eachNum->eachNum*eachNum)
                .filter(eachSquare->eachSquare>100)
                .mapToInt(eachSquare->eachSquare)
                .average()
                .getAsDouble();
        System.out.println(result);
        ////////////////////////////////////////////


        //find all duplicates
        List<Integer> mixList=Arrays.asList(1,2,3,4,5,6,1,2,6);
        Set<Integer> DupList= mixList.stream().filter(eachNum->Collections.frequency(mixList,eachNum)>1).collect(Collectors.toSet());
        System.out.println(DupList);
        ////////////////////////////////////////////






    }


}
