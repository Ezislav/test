package c.leetCode.base;

public class Array {

    // Объявление массива без инициализации
    int[] numbers;
    String[] names;

    // Объявление и создание массива с заданным размером
    int[] numbers2 = new int[5];
    String[] names2 = new String[3];

    // Объявление и инициализация массива с конкретными значениями
    int[] numbers3 = {1, 2, 3, 4, 5};
    String[] names3 = {"Alice", "Bob", "Charlie"};

    //Создание и заполнение массива с использованием new
    int[] numbers4 = new int[]{1, 2, 3, 4, 5};
    String[] names4 = new String[]{"Alice", "Bob", "Charlie"};

    // Создание двумерного массива
    int[][] matrix = new int[3][3];  // Создание 3x3 двумерного массива целых чисел

    int[][] predefinedMatrix = {  // Создание и инициализация двумерного массива целых чисел
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

}