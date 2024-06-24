package leetCode.blind75.ArrayString;

//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                stringBuilder.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                stringBuilder.append(word2.charAt(i));
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }
}