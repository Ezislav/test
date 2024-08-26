package solid;

//Принцип единственной ответственности (SRP)
//Класс должен иметь только одну причину для изменения, то есть он должен выполнять только одну функцию или задачу.

public class SingleResponsibilityPrinciple {


    // Плохой пример, в одном классе несколько разных функций, должна быть одна
    public class User1 {
        public String username;
        public String password;

        public void login(String username, String password) {
            // логика входа
        }

        public void saveToDatabase() {
            // логика сохранения в базу данных
        }
    }


    // Хороший пример, несколько классов, у каждого своя задача
    public class User2 {
        public String username;
        public String password;
    }

    public class UserAuthentication {
        public void login(String username, String password) {
            // логика входа
        }
    }

    public class UserRepository {
        public void saveToDatabase(User2 user) {
            // логика сохранения в базу данных
        }
    }
}