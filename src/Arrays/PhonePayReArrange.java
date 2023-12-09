package Arrays;

import java.util.Arrays;
import java.util.List;

public class PhonePayReArrange {
    public static void main(String[] args) {
//        s=eetm
//        array= {1,2,3,0}
//        Output = meet

        String str = "eetm";
        String emp="";
        char []result= new char[str.length()];
        Integer[] array = new Integer[]{1, 2, 3, 0};
        for(int i=0;i<array.length;i++){
            result[array[i]]=str.charAt(i);

        }
        for(char c : result){
            emp+=c;
        }
        System.out.println(emp);

}
}
