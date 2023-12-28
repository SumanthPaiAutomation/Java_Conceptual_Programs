package Random;

import java.util.Arrays;


    public class StringRotateToLeft {
        public static void main(String[] args) {
            String[] arr = {"A", "B", "C", "D", "E"};
            int n = 2;

            System.out.println("Original Array: " + Arrays.toString(arr));

            leftRotate(arr, n);

            System.out.println("Array after left rotation: " + Arrays.toString(arr));
        }

        public static void leftRotate(String[] arr, int n) {
            int length = arr.length;
            reverse(arr, 0, n - 1);
            reverse(arr, n, length - 1);
            reverse(arr, 0, length - 1);
        }

        public static void reverse(String[] arr, int start, int end) {
            while (start < end) {
                String temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }


