package Random;

public class MoveZerosToLeft {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 0, 3, 0, 4, 5, 0, 6, 0};

        int writeIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[writeIndex++] = arr[i];
            }
        }

        while (writeIndex < arr.length) {
            arr[writeIndex++] = 0;
        }

        for (Integer eachele : arr) {
            System.out.print(eachele.toString() + " ");
        }
    }
}
