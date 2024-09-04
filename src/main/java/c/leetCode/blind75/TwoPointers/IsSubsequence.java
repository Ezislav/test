package c.leetCode.blind75.TwoPointers;

//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {

        char[] subString = s.toCharArray();
        char[] fullString = t.toCharArray();

        int subIndex = 0;

        for (int i = 0; i < fullString.length && subIndex < subString.length; i++) {

            if (subString[subIndex] == fullString[i]) {
                subIndex++;
            }
        }

        System.out.println(subIndex == subString.length);
        return subIndex == subString.length;
    }

    public static void main(String[] args) {
        isSubsequence("abc", "ahbgdc");
    }
}
