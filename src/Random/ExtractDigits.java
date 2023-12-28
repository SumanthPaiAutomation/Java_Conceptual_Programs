package Random;

import java.util.ArrayList;
import java.util.List;

public class ExtractDigits {
    public static void main(String[] args) {
        String find="123dgvuierh278ejoue678";
        String reference = "1234567890";
        List<Character> lister = new ArrayList<>();
        for(int i=0;i<reference.length();i++){
            lister.add(reference.charAt(i));
        }
        for(int i=0;i<find.length();i++){
            if(lister.contains(find.charAt(i))){
                System.out.print(find.charAt(i)+" ");
            }

        }
    }


}
