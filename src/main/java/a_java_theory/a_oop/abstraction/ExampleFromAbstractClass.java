package a_java_theory.a_oop.abstraction;

public class ExampleFromAbstractClass extends AbstractionClassExample {
    public ExampleFromAbstractClass() {
    }

    public static void main(String[] args) {
        ExampleFromAbstractClass exampleClass = new ExampleFromAbstractClass();
        exampleClass.sayHello();
    }
    @Override
    public void sayHello() {
        System.out.println("Say Hello");
    }
}
