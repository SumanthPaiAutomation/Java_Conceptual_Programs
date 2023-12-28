package Random;

import java.util.HashMap;

public class FirstRepeatingHashmap {
    public static void main(String[] args) {
        //Most Recent Repeating
        String str="cbaejfujakjfc";
        HashMap<Character,Integer>mapper=new HashMap<>();
        boolean repeatFlag=false;
        Character repeated=null;
        for(int i=0;i<str.length();i++){
            if(mapper.containsKey(str.charAt(i))){
                mapper.put(str.charAt(i),mapper.get(str.charAt(i))+1);
                repeated=str.charAt(i);
                repeatFlag=true;
            }else {
                mapper.put(str.charAt(i),1);
            }
            if(repeatFlag==true){
                break;
            }
        }
        System.out.println(repeated);
    }

}
