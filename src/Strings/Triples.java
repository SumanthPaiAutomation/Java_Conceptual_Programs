package Strings;

public class Triples {
    public static void main(String[] args) {
        String str ="welllcommmmeee";
        //String[] strArr=str.split("");
        int triples=0;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i+1)==str.charAt(i+2)){
                triples++;
            }
        }
        System.out.println("Number of triples in the string is : "+triples);

    }
}
