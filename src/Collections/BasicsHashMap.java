package Collections;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BasicsHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hasher = new HashMap<>();
        hasher.put("key1","value1");
        hasher.put("key2","value2");
        for(int i=3;i<=20;i++){
            hasher.put("key"+i,"value"+i);
        }
        //System.out.println(hasher);
        //////////////////////////////////////////////
        for(Map.Entry x:hasher.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
        ////////////////////////////////////////////////
        System.out.println(hasher.containsKey("key17"));
        System.out.println(hasher.containsValue("value20"));
        System.out.println(hasher.keySet());
        System.out.println(hasher.values());
    }
}
