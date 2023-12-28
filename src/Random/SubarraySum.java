package Random;

public class SubarraySum {
    public static void findSubarrays(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > k) {
                sum =sum- arr[start];
                start++;
            }

            if (sum == k) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 9;

        findSubarrays(arr, k);
    }
}
