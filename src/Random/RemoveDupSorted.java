package Random;

import java.util.HashSet;

public class RemoveDupSorted {
    public static void main(String[] args) {
        //int[] arr = {1, 5, 8, 10, 8, 9};
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]!=arr[i+1]){
//                arr[i]=arr[i+1];
//            }
//        }
//        for(int eachInt: arr){
//            System.out.print(eachInt);
//        }
//        HashSet<Integer>hashSet=new HashSet<>();
//                for(int eachInt: arr){
//            hashSet.add(eachInt);
//        }
//        System.out.print(hashSet);
        int newIndex = 0;
        int[] arr = {2, 3, 5, 2, 7, 5};

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
        for(int eachInt : arr){
            System.out.print(eachInt);
        }
    }


}
