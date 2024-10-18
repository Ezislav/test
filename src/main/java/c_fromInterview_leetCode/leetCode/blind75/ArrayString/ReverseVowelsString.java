package c_fromInterview_leetCode.leetCode.blind75.ArrayString;

import java.util.HashMap;

//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75

public class ReverseVowelsString {

    public static String reverseVowels(String s) {

        char[] charsArray = s.toCharArray();

        HashMap<Character, Character> map = new HashMap<>();
        map.put('A', 'A');
        map.put('a', 'a');
        map.put('E', 'e');
        map.put('e', 'e');
        map.put('I', 'I');
        map.put('i', 'i');
        map.put('O', 'O');
        map.put('o', 'o');
        map.put('U', 'U');
        map.put('u', 'u');

        int start = 0;
        int end = charsArray.length - 1;

        while (start < end) {

            while (start < end && !map.containsKey(charsArray[start])) {
                start++;
            }

            while (start < end && !map.containsKey(charsArray[end])) {
                end--;
            }

            char temp = charsArray[start];
            charsArray[start] = charsArray[end];
            charsArray[end] = temp;

            start++;
            end--;
        }

        String result = new String(charsArray);
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        reverseVowels("lllllleetcode");
    }
}
