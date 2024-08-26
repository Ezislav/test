package OOP;

// Конструкторы в Java обеспечивают гибкость, безопасность и контроль за процессом создания объектов.
// Они позволяют установить начальное состояние объектов, поддерживать принцип инкапсуляции, работать с наследованием и перегрузкой,
// а также контролировать количество создаваемых экземпляров класса.

// Вот основные причины, по которым конструкторы необходимы:
public class ConstructorExample {
}

//1. Инициализация объектов
// Конструкторы позволяют задать начальное состояние объекта, присваивая значения полям класса при его создании.
// Это помогает избежать работы с объектами в невалидном или частично инициализированном состоянии.
class Person {
    static String name;
    static int age;

    // Конструктор по умолчанию
    public Person() {
        this.name = name;
        this.age = age;
    }

    // Перегруженный конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static Person person = new Person();
    static Person person2 = new Person("andyr", 25);
}


//2. Наследование и вызов конструкторов суперклассов
//   В наследуемых классах конструкторы позволяют обеспечить корректную инициализацию базового класса через вызов конструктора суперкласса.
//   Это важно для инициализации всех уровней иерархии наследования.
class Animal {
    String name;

    // Конструктор суперкласса
    public Animal(String name) {
        this.name = name;
    }

    Animal animal = new Animal("Andrey");
}

class Dog extends Animal {
    String breed;

    // Конструктор подкласса, вызывающий конструктор суперкласса
    public Dog(String name, String breed) {

        super(name);
        this.breed = breed;
    }

    public Dog(String name) {
        super(name);
    }
}