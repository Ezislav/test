package a_java_theory.d_multithreading.b_SyncronizedAndVolatile.AtomicClass;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    public static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {

        atomicInteger.incrementAndGet();
        atomicInteger.addAndGet(5);
        int current = atomicInteger.get();
        System.out.println("Current value: " + current);
    }
}
