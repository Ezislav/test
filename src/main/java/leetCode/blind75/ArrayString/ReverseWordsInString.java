package leetCode.blind75.ArrayString;

//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

public class ReverseWordsInString {
    public static String reverseWords(String s) {

        String[] array = s.trim().replaceAll("\\s+", " ").split(" ");

        int start = 0;
        int end = array.length - 1;

        while (start < end) {

            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        String newString = String.join(" ", array);
        System.out.println(newString);

        return newString;
    }

    public static void main(String[] args) {
        reverseWords("a good   example");
    }
}
