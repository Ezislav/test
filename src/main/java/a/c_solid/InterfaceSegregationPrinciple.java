package a.c_solid;

//Принцип разделения интерфейса (ISP)
//Клиенты не должны зависеть от интерфейсов, которые они не используют. Лучше иметь несколько специализированных интерфейсов, чем один общий.
public class InterfaceSegregationPrinciple {

    // Плохой пример, один интрефейс имеет несколько разных задач
    public interface Worker {
        void work();
        void eat();

    }
    public class Human implements Worker {
        @Override
        public void work() {
            // логика работы
        }

        @Override
        public void eat() {
            // логика еды
        }
    }

    public class Robot1 implements Worker {
        @Override
        public void work() {
            // логика работы
        }

        @Override
        public void eat() {
            // роботы не едят, пустая реализация
        }
    }

    // Хороший пример, есть отдельный интерфейс для рабочего, отдельный интерфейс для еды, как никак это разные задачи
    // Если бы они были похожими по типу Есть и Пить, то можно было бы объединить в один
    public interface Workable {
        void work();
    }

    public interface Eatable {
        void eat();
    }

    public class Human2 implements Workable, Eatable {
        @Override
        public void work() {
            // логика работы
        }

        @Override
        public void eat() {
            // логика еды
        }
    }

    public class Robot2 implements Workable {
        @Override
        public void work() {
            // логика работы
        }
    }


}
