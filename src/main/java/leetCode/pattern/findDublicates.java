package leetCode.pattern;

import java.util.*;

//https://youtube.com/watch?v=P59M5RPi2Ig&list=PLCKD2XyZJi6tlvGZhwCdXsXbZ3h3ZWrCR
public class findDublicates {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1, 1}; //3, 2
//        findUniqueValues(nums);
    }

//    public static int[] findUniqueValues(int[] nums) {
//
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//
//        ArrayList arrayList = new ArrayList();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (!set.add(nums[i])) {
//                // Element is a duplicate
//                if (!arrayList.contains(nums[i])) {
//                    arrayList.add(nums[i]);
//                }
//            }
//        }
//        System.out.println(set);
//        System.out.println(arrayList);
////        int[] arrayList2 = arrayList.stream().mapToInt(Integer::intValue).toArray();
////        return arrayList2;
//
//    }
}
