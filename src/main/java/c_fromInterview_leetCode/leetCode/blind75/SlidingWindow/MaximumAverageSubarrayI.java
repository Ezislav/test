package c_fromInterview_leetCode.leetCode.blind75.SlidingWindow;

//https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=leetcode-75
public class MaximumAverageSubarrayI {


    //My Solution
//    public static double findMaxAverage(int[] nums, int k) {
//        int pointer = nums.length - k;
//        System.out.println(pointer);
//        double[] result = new double[nums.length];
//
//        for (int i = 0; i < pointer + 1; i++) {
//
//            int[] tempArray = Arrays.copyOfRange(nums, i, k + i);
//            System.out.println(Arrays.toString(tempArray));
//
//            double sum = 0;
//            for (double t : tempArray) {
//                sum += t;
//            }
//
//            double divide = sum/k;
//            result[i] = divide;
//            System.out.println(Arrays.toString(result));
//        }
//
//        System.out.println(Arrays.stream(result).max().getAsDouble());
//        return Arrays.stream(result).max().getAsDouble();
//    }


    //Chat GPT solution
    public static double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        long maxSum = sum;
        for(int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / (double) k;
    }



    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        findMaxAverage(nums, 4);
    }
}