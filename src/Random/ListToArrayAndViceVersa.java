package Random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayAndViceVersa {

	public static void main(String[] args) {
		// Creating and populating the ArrayList
		ArrayList<Integer> listObj = new ArrayList<>();
		listObj.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
		System.out.println("List is:");
		for (Integer i : listObj) {
			System.out.println(i);
		}

		System.out.println("Converting to array");
		// Converting ArrayList to Array
		Integer[] arr = listObj.toArray(new Integer[0]);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();

		// Converting Array back to List
		List<Integer> newList = Arrays.asList(arr);
		System.out.println("Converted back to list:");
		for (Integer i : newList) {
			System.out.println(i);
		}
	}
}
