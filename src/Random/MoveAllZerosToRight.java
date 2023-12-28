package Random;

public class MoveAllZerosToRight {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 0, 3, 0, 4, 5, 0, 6, 0};

        int readIndex = arr.length - 1;
        int writeIndex = arr.length - 1;

        while (readIndex >= 0) {
            if (arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex--;
            }
            readIndex--;
        }

        while (writeIndex >= 0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }

        for (Integer eachele : arr) {
            System.out.print(eachele.toString() + " ");
        }
    }
}
