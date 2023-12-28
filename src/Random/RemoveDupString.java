package Random;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupString {
    public static void main(String[] args) {
        String str = "javaTpoint is the best learning website";
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hashSet.add(str.charAt(i));
        }
        String empStr="";
        for(Character eachChar : hashSet){
            empStr+=eachChar;
        }
        System.out.println(empStr);
    }
}
