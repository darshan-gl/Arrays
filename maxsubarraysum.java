public class maxsubarraysum {
    
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    static int findMaxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = arr[i];
            } else {
                currentSum = currentSum + arr[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}

