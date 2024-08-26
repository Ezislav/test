package solid;

//Принцип открытости/закрытости (OCP)
//Программные сущности должны быть открыты для расширения, но закрыты для изменения.

// Основная идея OCP заключается в том, что при добавлении нового функционала или изменении требований к системе,
// мы должны минимизировать изменения в уже написанном коде.
// Вместо того чтобы модифицировать существующий код, мы должны иметь возможность добавлять новый код,
// который расширяет или модифицирует поведение системы.

public class OpenClosedPrinciple {

    // Плохой пример
    public class Rectangle1 {
        public double length;
        public double width;
    }

    public class AreaCalculator1 {
        public double calculateArea(Object shape) {
            if (shape instanceof Rectangle1) {
                Rectangle1 rectangle = (Rectangle1) shape;
                return rectangle.length * rectangle.width;
            }

            // Новые фигуры требуют изменения этого метода
            return 0;
        }
    }

    // Хороший пример
    public abstract class Shape {
        public abstract double calculateArea();
    }

    public class Rectangle2 extends Shape {
        public double length;
        public double width;

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    public class AreaCalculator2 {
        public double calculateArea(Shape shape) {
            return shape.calculateArea();
        }
    }

}
