public class rainwater {
        public static void main(String[] args) {
        int[] height = {3, 0, 2, 0, 4};
        int totalWater = 0;

        for (int i = 0; i < height.length; i++) {
            int leftMax = 0;
            
            for (int j = 0; j <= i; j++) {
                if (height[j] > leftMax) {
                    leftMax = height[j];
                }
            }

            int rightMax = 0;
            for (int j = i; j < height.length; j++) {
                if (height[j] > rightMax) {
                    rightMax = height[j];
                }
            }

            int water = Math.min(leftMax, rightMax) - height[i];
            totalWater =totalWater+water;
        }

        System.out.println("Trapped rain water: " + totalWater);
    }
}

