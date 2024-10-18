package a_java_theory.b_designPattern.c_solid;

//Принцип инверсии зависимостей (DIP)
//Модули верхнего уровня не должны зависеть от модулей нижнего уровня. Оба должны зависеть от абстракций.
//Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.


//Основная идея DIP состоит в том, что модули (или классы) должны зависеть от абстракций (интерфейсов или абстрактных классов),
// а не от конкретных реализаций.
// Это делает систему более гибкой и уменьшает связанность, что позволяет легче менять или заменять части системы без значительных изменений в коде.

public class DependencyInversionPrinciple {

    // Плохой пример
    public class LightBulb1 {
        public void turnOn() {
            // включить лампочку
        }

        public void turnOff() {
            // выключить лампочку
        }
    }

    public class Switch {
        private LightBulb1 lightBulb;

        public Switch() {
            this.lightBulb = new LightBulb1();
        }

        public void operate() {
            // управление лампочкой
            lightBulb.turnOn();
            lightBulb.turnOff();
        }
    }

    // Хороший пример
    public interface Switchable {
        void turnOn();
        void turnOff();
    }

    public class LightBulb2 implements Switchable {
        @Override
        public void turnOn() {
            // включить лампочку
        }

        @Override
        public void turnOff() {
            // выключить лампочку
        }
    }

    public class Switch2 {
        private Switchable device;

        public Switch2(Switchable device) {
            this.device = device;
        }

        public void operate() {
            // управление устройством
            device.turnOn();
            device.turnOff();
        }
    }
}