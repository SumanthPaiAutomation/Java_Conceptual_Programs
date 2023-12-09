package Arrays;

import java.util.Arrays;

public class MovingZeros {

    public static int[] rightMoveZeros(int[] arr) {
        int count = 0; // Count of non-zero elements
        int n=arr.length;
        // Traverse the array. If the element encountered is non-zero,
        // replace the element at index 'count' with this element.
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        // Fill remaining positions with zeros from count to end.
        while (count < n)
            arr[count++] = 0;

        return arr;
    }

    public static int[] leftMoveZeros(int[] arr) {
        int n=arr.length;
        int count = n - 1;

        // Traverse the array in reverse order. If the element encountered is non-zero,
        // replace the element at index 'count' with this element.
        for (int i = n - 1; i >= 0; i--)
            if (arr[i] != 0)
                arr[count--] = arr[i];

        // Fill remaining positions with zeros from the beginning to count.
        while (count >= 0)
            arr[count--] = 0;

        return arr;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 0, 2, 0, 3, 4, 0, 5};
        int[] rightMoved = rightMoveZeros(Arrays.copyOf(array1, array1.length));
        System.out.println("Right Move Zeros: " + Arrays.toString(rightMoved));

        int[] array2 = new int[]{0, 1, 0, 2, 3, 4, 5, 0};
        int[] leftMoved = leftMoveZeros(Arrays.copyOf(array2, array2.length));
        System.out.println("Left Move Zeros: " + Arrays.toString(leftMoved));
    }
}
