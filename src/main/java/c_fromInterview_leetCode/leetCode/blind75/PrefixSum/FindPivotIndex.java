package c_fromInterview_leetCode.leetCode.blind75.PrefixSum;

//https://leetcode.com/problems/find-pivot-index/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {

        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (rightSum == leftSum) {
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        pivotIndex(nums);
    }

}
