

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] =prefix[i-1]+arr[i];
        }

        int max =prefix[k-1];

        for (int i=k;i<n;i++) {
            int sum=prefix[i]-prefix[i - k];
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println("Maximum subarray sum of size " + k + " is: " + max);
    }
}
