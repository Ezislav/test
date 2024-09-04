package c.interviewTask.taskFromInternet;

import java.io.FileNotFoundException;
import java.io.IOException;


//Какая проблема возникнет с этим кодом?

public class Task3 {

//    Ответ: Данный код не скомпилируется. Это вопрос на знание иерархии исключений.

//    Проблема заключается в том, что FileNotFoundException является подклассом IOException.
//    В Java блоки catch проверяются сверху вниз, и если более общий класс исключения (IOException) уже обработан,
//    то код для обработки более специфичного исключения (FileNotFoundException) станет недостижимым, что приводит к ошибке компиляции.

// exception java.io.FileNotFoundException has already been caught

    public static void main(String[] args) {

//        try {
//            foo();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//        Должны быть так:
        try {
            foo();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) { // IOException e FileNotFoundException
            e.printStackTrace();
        }
    }

    public static void foo() throws IOException, FileNotFoundException {
        System.out.println("Some text");
    }
}