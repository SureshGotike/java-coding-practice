public class MaxSum {

    private int findMaxSum(int[] arr, int k) {

        int maxSum = 0;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }

        maxSum = windowSum;

        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);

        }
        return maxSum;

    }

    public static void main(String[] args) {
        MaxSum longestSubstring = new MaxSum();

        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        int maxSum = longestSubstring.findMaxSum(arr, k);
        System.out.println(maxSum);

    }
}
