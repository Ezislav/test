package interviewTask.realTask;

//Что здесь выведется?

//0, 40
//0, 40
public class Task1 {
    public static void main(String[] args) {

        int x = 0;
        int[] arr = {20};

        f(x, arr);
        System.out.println(x + ", " + arr[0]);

        g(x, arr);
        System.out.println(x + ", " + arr[0]);
    }

    private static void f(int x, int[] arr) {
        // Изменение локально для функции и не влияет на x в методе main.
        x += 30;
        // Изменение видно в методе main, потому что массивы передаются по ссылке.
        arr[0] = 40;
    }

    private static void g(int x, int[] arr) {
        // Изменение локально для функции и не влияет на x в методе main.
        x = 50;
        // Создает новый массив, но эта новая ссылка локальна для метода g и не влияет на исходный массив arr в main.
        arr = new int[60];
    }
}
