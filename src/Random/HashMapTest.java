package pack.collection.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashMapper = new HashMap<Integer, String>();

		hashMapper.put(101, "value1");
		hashMapper.put(102, "value2");

		hashMapper.put(103, "value3");

		hashMapper.put(104, "value4");
		hashMapper.put(105, "value5");

		hashMapper.put(106, "value6");
		System.out.println("Before modifcation hashmap is " + hashMapper);
		for(Map.Entry eachvalue : hashMapper.entrySet()) {
			//String s = eachvalue.getValue();
			//if(s.contains("6")) {
			//	hashMapper.remove(eachvalue);
			//}
			System.out.println(eachvalue.getKey()+" "+eachvalue.getValue());
			String s = eachvalue.getValue().toString();
			if(s.contains("value6")) {
			Object keyrem = eachvalue.getKey();
			hashMapper.remove(keyrem);
			}
		}
		
		System.out.print("value 6 removed by filtering , new list is "+hashMapper);

	}

}
