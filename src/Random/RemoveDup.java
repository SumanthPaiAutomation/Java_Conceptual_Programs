package Random;

import java.util.ArrayList;
import java.util.List;

public class RemoveDup {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 2, 7, 5};

        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[newIndex] = arr[i];
                newIndex++;
            }
        }

        // Print the resulting array
        for (int i = 0; i < newIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        new RemoveDup().removeEntirely();
    }

    public void  removeEntirely() {
        int[] arr = {2, 3, 5, 2, 7, 5};

        List<Integer> uniqueElements = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate && !uniqueElements.contains(arr[i])) {
                uniqueElements.add(arr[i]);
            }
        }

        // Print the unique elements
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
    }




}
