package Random;

public class MaxSubarray {
    public class MaximumSubarray {
        public static void main(String[] args) {
            int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
            printMaxSubarray(arr);
        }
        public static void printMaxSubarray(int[] arr) {
            int maxSoFar = arr[0];
            int maxEndingHere = arr[0];
            int start = 0;
            int end = 0;
            int tempStart = 0;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > maxEndingHere + arr[i]) {
                    tempStart = i;
                    maxEndingHere = arr[i];
                } else {
                    maxEndingHere = maxEndingHere + arr[i];
                }

                if (maxEndingHere > maxSoFar) {
                    maxSoFar = maxEndingHere;
                    start = tempStart;
                    end = i;
                }
            }

            System.out.println("Maximum subarray:");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


    }

}
