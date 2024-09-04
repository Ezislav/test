package c.interviewTask.taskFromInternet;

import java.util.Arrays;

//    Напишите функцию, которая принимает на вход массив объектов и возвращает массив имен всех объектов.
public class Task4 {

    public static void main(String[] args) {
        Object[] objects = { new People("andrey"), new People("Igor"), new People("Vanya")};
        foo(objects);
    }

    public static String[] foo(Object[] objects) {

        String[] arrayNames = new String[objects.length];

        for (int i = 0; i < objects.length; i++) {
            People person = (People) objects[i];
            arrayNames[i] = person.name;
        }
        System.out.println(Arrays.toString(arrayNames));
        return arrayNames;
    }
}

class People {

    public People(String name) {
        this.name = name;
    }

    String name;
}
