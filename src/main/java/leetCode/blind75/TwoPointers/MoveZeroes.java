package leetCode.blind75.TwoPointers;

//https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer++] = nums[i];
            }
        }

        for (int i = pointer; i < nums.length; i++) {
            nums[i] = 0;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }


    //Solution 2;
//    public static void moveZeroes(int[] nums) {
//
//        int snowBallSize = 0;
//
//        for (int i = 0; i < nums.length; i++){
//
//            if (nums[i] == 0){
//                snowBallSize++;
//            }
//
//            else if (snowBallSize > 0) {
//                int t = nums[i];
//                nums[i] = 0;
//                nums[i - snowBallSize] = t;
//            }
//        }
//    }


    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
