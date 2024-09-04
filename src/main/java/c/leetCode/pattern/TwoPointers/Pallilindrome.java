package c.leetCode.pattern.TwoPointers;

public class Pallilindrome {

//    Идея: Указатели начинаются с начала и конца массива и двигаются навстречу друг другу.
//    Пример: Определение, является ли массив палиндромом.

//    Задача:
//    Проверить является ли строка палиндромом.

    public static void main(String[] args) {
        isPallilindrome("carerac");
    }

    public static boolean isPallilindrome(String s) {

        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {

            if (charArray[left] != charArray[right]) {
                System.out.println("false");
                return false;
            }
                left++;
                right--;
        }
        System.out.println("true");
        return true;
    }
}
