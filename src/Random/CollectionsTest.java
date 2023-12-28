package Random;

import java.util.ArrayList;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList<String> list = new<String> ArrayList();
		list.add("scoot");
		list.add("value two");
		list.add("value two");

		list.add("value 3");

		list.add("value 4");
		System.out.println("Before removig"+list);
		list.remove(2);
		System.out.println("After removing"+list);
		list.add(1,"Replaced value");
		System.out.println("After inserting"+list);
		//using enhanced for loop
		for (String s : list) {
			System.out.println(s);
			if(s.contains("Replaced")) {
				System.out.println("Index of searching value is "+list.indexOf(s));
			}
		}
	}

}
