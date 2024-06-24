package leetCode.blind75.ArrayString;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// >= max - true
// < max - false

public class KidsWithTheGreatestNumberCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        ArrayList<Boolean> booleanArrayList = new ArrayList<>(candies.length);


        int maxCandiesInRow = Arrays.stream(candies).max().getAsInt();
        System.out.println(maxCandiesInRow);

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] + extraCandies >= maxCandiesInRow) {
                booleanArrayList.add(true);
            }

            if (candies[i] + extraCandies < maxCandiesInRow) {
                booleanArrayList.add(false);
            }
        }

        System.out.println(booleanArrayList);
        return booleanArrayList;
    }

    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        kidsWithCandies(candies, extraCandies);
    }

}
