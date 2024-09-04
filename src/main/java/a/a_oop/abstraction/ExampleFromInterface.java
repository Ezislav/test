package a.a_oop.abstraction;

public class ExampleFromInterface implements AbstractInterfaceExample {

    @Override
    public void sayHello() {
        System.out.println("say hello");
    }

    public static void main(String[] args) {
        ExampleFromInterface exampleFromInterface = new ExampleFromInterface();
        exampleFromInterface.sayHello();

    }
}
