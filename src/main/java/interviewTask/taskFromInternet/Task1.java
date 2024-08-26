package interviewTask.taskFromInternet;

//Какой результат выведет вызов метода foo()?

import org.junit.jupiter.api.Test;

public class Task1 {

//    Строки в Java являются неизменяемыми (immutable). Это значит, что операция m += " World!"; создаёт новую строку, но не изменяет исходную строку m
    @Test
    void foo() {

        String m = "Hello";
        System.out.print(m);
        bar(m);
        System.out.print(m);
    }

//    HelloHello

    void bar(String m) {
        m += " World!";
    }

//    код выводит "HelloHello" потому, что изменение строки в методе bar не влияет на строку, переданную в метод foo

}
