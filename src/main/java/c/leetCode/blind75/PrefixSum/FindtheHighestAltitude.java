package c.leetCode.blind75.PrefixSum;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-highest-altitude/submissions/1214364588/?envType=study-plan-v2&envId=leetcode-75

public class FindtheHighestAltitude {
    public static int largestAltitude(int[] gain) {

        int[] result = new int[gain.length + 1];
        result[0] = 0;

        for (int pointer = 0; pointer < gain.length; pointer++) {
            result[pointer + 1] = result[pointer] + gain[pointer];
        }

        System.out.println(Arrays.toString(result));
        return Arrays.stream(result).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        largestAltitude(gain);
    }

}
