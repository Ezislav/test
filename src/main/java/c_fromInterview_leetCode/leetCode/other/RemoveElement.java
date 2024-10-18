package c_fromInterview_leetCode.leetCode.other;

import java.util.Arrays;

//https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Указатель для размещения следующего элемента, не равного val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k; // k - количество элементов, не равных val
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        // Пример 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("Пример 1: k = " + k1 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, k1)));

        // Пример 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = solution.removeElement(nums2, val2);
//        System.out.println("Пример 2: k = " + k2 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, k2)));
        System.out.println("Пример 2: k = " + k2 + ", nums = " + Arrays.toString(nums2));
    }
}
