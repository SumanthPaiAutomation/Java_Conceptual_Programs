package Random;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {21, 23, 43, 56, 78, 98, 12};
        new RotateArray().rightRotate(arr, 3);
    }

    public void rightRotate(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                int nextIndex = j - 1;
                arr[j] = arr[nextIndex];
            }
            arr[0] = temp;
        }
        for (int eachInt = 0; eachInt < arr.length; eachInt++) {
            System.out.print(" " + arr[eachInt]);
        }
    }
}
