package c.leetCode.blind75.ArrayString;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length - 1];
//        int count = 0;
//        int temp = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = nums.length - 1; j < i; j--) {
                if (j != i) {
                    result[i] = nums[i];
                }
            }

//            if (i == count) {
//
//            }
//            result[i] =

        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //           [24, 12, 8, 6]
        productExceptSelf(nums);
    }
}
