package Arrays;

import java.util.Arrays;

public class RotateArrayUsingK {

    public static int[] leftRotateArray(int[] arr, int num_of_rotation) {
        while (num_of_rotation > 0) {
            int rot = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = rot;
            num_of_rotation--;
        }
        return arr;
    }

    public static int[] rightRotateArray(int[] arr, int num_of_rotation) {
        while (num_of_rotation > 0) {
            int rot = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = rot;
            num_of_rotation--;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rightRotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 2)));
        System.out.println(Arrays.toString(leftRotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 2)));
    }
}
