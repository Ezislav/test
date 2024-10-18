package c_fromInterview_leetCode.leetCode.other;

//https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150

public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // Если текущий индекс не может быть достигнут из предыдущих индексов
            }
            maxReach = Math.max(maxReach, i + nums[i]); // Обновляем максимальное расстояние, которое можно пройти
            if (maxReach >= nums.length - 1) {
                return true; // Если последний индекс может быть достигнут
            }
        }
        return false;
    }
}
