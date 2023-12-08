package Strings;

public class AlternateEvenChar {
    public static void main(String[] args) {
        String str="Welcome sumanth pai";
        String empStr="";
        String []strArray=str.split(" ");
        for(int j=1;j<strArray.length;j++){
            for(int i=0;i<strArray[j].length();i++){
                if(i%2==0){
                    empStr+=strArray[j].charAt(i);
                }
            }
        }
        System.out.println(empStr);

    }
}
