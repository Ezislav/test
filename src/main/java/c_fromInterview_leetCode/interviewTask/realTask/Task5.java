package c_fromInterview_leetCode.interviewTask.realTask;

import java.util.*;

// from sqlTask1.sql
// Написать метод возвращает имена всех студентов (Student.name), причисленных к учителям из коллекции teachers
public class Task5 {

    public static void main(String[] args) {
        //Создали учителей
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        //Создали студентов
        Student student1 = new Student("Vasya", 22L);
        Student student2 = new Student("Egor", 23L);
        Student student3 = new Student("Valina", 24L);
        Student student4 = new Student("Petr", 26L);
        Student student5 = new Student("Olya", 34L);

        //Добавляем студентов учителю
        teacher1.setStudentsList(student1);
        teacher1.setStudentsList(student2);
        teacher1.setStudentsList(student3);
        teacher2.setStudentsList(student4);
        teacher2.setStudentsList(student5);

        //Добавляем в общую мапу
        Map<Teacher, List<String>> map = new HashMap<>();
        map.put(teacher1, teacher1.getStudentsList());
        map.put(teacher2, teacher2.getStudentsList());

        //Выводим для каждого учителя
//        System.out.println(map.get(teacher1));
//        System.out.println(map.get(teacher2));



        Collection<String> newCol = getStudentsNames(map, teacher1);
        System.out.println(newCol);

    }

    //2 вариант, если делать через метод, как изначально в задании
    public static Collection<String> getStudentsNames(Map<Teacher, List<String>> mapTeachers, Teacher teacher) {
        return mapTeachers.get(teacher);
    }

    static class Teacher {

        private Long id;
        private String name;
        private List<String> studentsList = new ArrayList<>();


        //метод для добавления учеников
        public void setStudentsList(Student student) {
            studentsList.add(student.getName());
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public List<String> getStudentsList() {
            return studentsList;
        }
    }

    static class Student {
        private String name;
        private Long id;

        public Student(String name, Long id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public Long getId() {
            return id;
        }
    }
}