package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MissinNumbersList {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6,7,1,2};
        Integer arr2[]={1,2,3,4,5,6,7,8,9};
        List<Integer>lister=new ArrayList<>();
        for(Integer c : arr){
            lister.add(c);
        }
        for(Integer x : arr2){
            if(lister.contains(x)){
                continue;
            }else {
                System.out.println("Missing number is : "+x);
            }
        }
    }
}
