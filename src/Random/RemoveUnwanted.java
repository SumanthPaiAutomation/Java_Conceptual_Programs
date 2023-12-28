package Random;

import java.util.ArrayList;
import java.util.List;

public class RemoveUnwanted {
    public static void main(String[] args) {
        String str="qwewfoijwhrigwr&%$ejui3874663fgeh";
        String referenceString="$%&#1234567890";
        String emtString="";
        for(int i=0;i<str.length();i++){
            if(referenceString.indexOf(str.charAt(i))<0){
                emtString+=str.charAt(i);
            }
        }
        System.out.println(emtString);
        System.out.println("The removal from List : "+new RemoveUnwanted().removeWithList(str));
    }
    public String removeWithList(String str){
        String referenceString="$%&#1234567890";
        String emp="";
        List<Character> lister = new ArrayList<>();
        for(int i=0;i<referenceString.length();i++){
            lister.add(referenceString.charAt(i));
        }
        for(Character eachCahr : str.toCharArray()){
            if(!lister.contains(eachCahr)){
                emp+=eachCahr;
            }
        }
        return emp;
    }

}
