package c.leetCode.blind75.ArrayString;

//https://leetcode.com/problems/can-place-flowers/description/
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;


        if(flowerbed.length == 1){
            if(flowerbed[0] != 1){
                count++;
            }
            if(count == n || count > n){
                return true;
            }
            else{
                return false;
            }
        }

        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            count++;
            flowerbed[0] = 1;
        }

        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            count++;
            flowerbed[flowerbed.length - 1] = 1;
        }

        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                count++;
                flowerbed[i] = 1;
            }
        }

        if(count == n || count > n){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] flowerbed = {0,0,1,0,0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
