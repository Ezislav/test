package leetCode.pattern.ArrayString;

public class BruteForceExample {

    //Brute Force

    //Идея: Пройтись по всем возможным комбинациям или подстрокам.
    //Пример: Поиск всех подстрок в строке.

    //Задача:
    //Найти подстроку с максимальной суммой ASCII значений символов.
    public static int maxSubstringSum(String s) {
        int maxSum = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentSum = 0;
            for (int j = i; j < s.length(); j++) {
                currentSum += s.charAt(j);
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(maxSubstringSum(s));  // Output: 294 (сумма ASCII для "abc")
    }
}
