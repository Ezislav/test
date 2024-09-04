package c.leetCode.pattern.topkElement;

public class topkElementExample {

    // Паттерн "Top K Element" часто используется для решения задач,
    // связанных с нахождением K наибольших или наименьших элементов в массиве, строки или других коллекциях данных.

    // Этот паттерн применим к задачам, где нужно найти топ-K частых элементов, топ-K наименьших/наибольших элементов,
    // или же нужно отсортировать элементы в пределах K.


    public static void main(String[] args) {
//        int[] nums = {3, 2, 1, 5, 6, 4}; //Output 5
        int[] nums = {3, 2, 1, 5, 6, 4}; //Output max value 6 without sorting
        int k = 2;
//        findElementByOrder(nums, k);

    }

//    public static int findElementByOrder(int[] nums, int k) {
//
//        int current = 0;
//        int maxValue = 0;
//
//        for (int i = 0; i < nums.length; i++) {
//
//            current = 0;
//            if (current < nums[i]) {
//                maxValue = current;
//            }
//        }
//        System.out.println(maxValue);
//        return maxValue;
//    }

}
