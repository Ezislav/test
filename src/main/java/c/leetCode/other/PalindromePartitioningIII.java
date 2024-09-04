package c.leetCode.other;

public class PalindromePartitioningIII {
    public int minCut(String s) {

        char[] chars = s.toCharArray();
        int output = 0;
        int element = chars.length-1;
        for (int i = 0; i < element ; i++) {
            if (chars[i] != chars[i + 1] && chars[i] != chars[element]) {
                output++;
            }
        }
        return output;
    }
}
