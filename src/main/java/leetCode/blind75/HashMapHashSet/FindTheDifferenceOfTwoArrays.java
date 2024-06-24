package leetCode.blind75.HashMapHashSet;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public static void findDifference(int[] nums1, int[] nums2) {

        int[] distinctNums1 = Arrays.stream(nums1).distinct().toArray();
        int[] distinctNums2 = Arrays.stream(nums2).distinct().toArray();

        HashSet set = new HashSet();


        for (int i = 0; i < distinctNums1.length; i++) {
            set.add(distinctNums1[i]);
        }

        System.out.println(set);

        for (int i = 0; i < distinctNums1.length; i++) {
            set.add(distinctNums2[i]);
        }

        System.out.println(set);




//        for (int nums : distinctNums1) {
//            System.out.println(nums);
//        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};

        findDifference(nums1, nums2);

    }

}
