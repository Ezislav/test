package a_java_theory.d_multithreading.b_SyncronizedAndVolatile.AtomicClass;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {

    public static AtomicReference<String> message = new AtomicReference<>("Hello");
    public static void main(String[] args) {

        message.set("World");
        String current = message.get();
        System.out.println("Current message: " + current);

        String previous = message.getAndSet("AtomicReference");
        System.out.println("Previous message: " + previous);
        System.out.println("Current message: " + message.get());
    }
}
