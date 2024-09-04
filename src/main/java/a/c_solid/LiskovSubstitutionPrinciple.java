package a.c_solid;

//Принцип подстановки Лисков (LSP)
//Объекты в программе должны быть заменяемы экземплярами их подтипов без изменения корректности программы.

// Принцип требует, чтобы подклассы могли полностью заменять суперклассы без изменения поведения программы.
// Это означает, что наследуемые классы должны соблюдать контракты, заданные базовыми классами, и не изменять их поведение неожиданным образом.

public class LiskovSubstitutionPrinciple {

    // Плохой пример
    public class Bird1 {
        public void fly() {
            // логика полета
        }
    }

    public class Ostrich extends Bird1 {
        @Override
        public void fly() {
            throw new UnsupportedOperationException("Страусы не летают");
        }
    }

    // Хороший пример
    public abstract class Bird2 {
        public abstract void move();
    }

    public class Sparrow2 extends Bird2 {
        @Override
        public void move() {
            fly();
        }

        private void fly() {
            // логика полета
        }
    }

    public class Ostrich2 extends Bird2 {
        @Override
        public void move() {
            run();
        }

        private void run() {
            // логика бега
        }
    }

}
