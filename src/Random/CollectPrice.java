package Random;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;

public class CollectPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] brand = {"a","b","c","d","e"};
		int [] price = {30,80,29,45,9};
		//ArrayList<String> br = Array.toList(brand);
		//ArrayLisy
		//HashMap<String,Integer> some = new HashMap<String,Integer>();
		//for(int i=0;i<)
		Map<String,Integer> map = new HashMap<String,Integer>();
		//int max=0;
		for(int i=0;i<price.length;i++){
		map.put(brand[i],price[i]);
		}
		int maxvalue = (Collections.max(map.values()));
		for(Map.Entry<String,Integer> eachMapEle : map.entrySet()) {
			//System.out.println(eachMapEle.getKey()+" "+eachMapEle.getValue());
			//int comp = (int) eachMapEle.getValue();
			if(eachMapEle.getValue().equals(maxvalue)) {
				System.out.println("Highest value : "+eachMapEle.getKey()+" with value : "+eachMapEle.getValue());
				break;
			}
		}
		
	}

}
/*
 * public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) { Set<T>
 * keys = new HashSet<T>(); for (Entry<T, E> entry : map.entrySet()) { if
 * (Objects.equals(value, entry.getValue())) { keys.add(entry.getKey()); } }
 * return keys; }
 */
