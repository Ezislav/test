package c_fromInterview_leetCode.interviewTask.realTask;
// Что будет выведено?

// Программа не скомпилируется без пустого конструктора в классе A из-за того, что конструкторы классов B и C неявно вызывают конструктор без параметров родительского класса A.

// При создании объекта C, последовательно вызываются конструкторы суперклассов, сначала вызывается конструктор A, затем B, затем C

// Для того чтобы программа компилировалась и выполнялась корректно, нужно либо добавить конструктор без параметров в класс A,
// либо явно вызывать существующий конструктор класса A с параметром из конструкторов классов B и C.
public class Task4 {

    public static void main(String[] args) {
        // Имеет тип B, но фактически ссылается на объект C. Поэтому будет вызван метод f() класса C
        B ref = new C();
        ref.f();
    }
}

class A {

    String name;

    // Решение 1: удалить у конструктора A на вход String name,
    public A(String name) {
        System.out.println("A");
    }

//    public A(String a) {
//        System.out.println("A");
//    }
    void f() {
        System.out.println("A.f()");
    }
}

class B extends A {
    public B() {
        // Решение 2: добавить инициализацию поля конструктора А
        super("a_java_theory");
        System.out.println("B");
    }
    void f() {
        System.out.println("B.f()");
    }
}

class C extends B {
    public C() {
        System.out.println("C");
    }
    void f() {
        System.out.println("C.f()");
    }
}


//Если мы вообще уберем все конструкторы, то под капотом работает так:
class A1 {
    public A1() {
        // пустой конструктор по умолчанию
    }
}

class B1 extends A1 {
    public B1() {
        super(); // неявный вызов конструктора по умолчанию класса A
        // пустой конструктор по умолчанию
    }
}

class C1 extends B1 {
    public C1() {
        super(); // неявный вызов конструктора по умолчанию класса B
        // пустой конструктор по умолчанию
    }
}

