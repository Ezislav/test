package interviewTask.taskFromInternet;

// Какой результат будет выведен в консоль?

public class Task2 {

// Console output:
// This is abstract class constructor
// This is demo class constructor

// Сначала выведется конструктор предка, потом конструктор потомка

    abstract static class OurAbstractClass {

        public OurAbstractClass() {
            System.out.println("This is abstract class constructor");
        }
    }

    static class OurDemoClass extends OurAbstractClass {

        public OurDemoClass() {
            System.out.println("This is demo class constructor");
        }
        public static void main(String[] args) {
            OurDemoClass ourDemoClass = new OurDemoClass();
        }
    }
}