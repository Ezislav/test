package c_fromInterview_leetCode.interviewTask.realTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Нужно при помощи стримов отфильтровать список, убрать из него элементы начинающиеся на B
public class Task3 {

    Object object = new Object();

    public static void main(String[] args) {


        List<String> list = new ArrayList<String>(Arrays.asList("A", "B", "C", "CA", "BB", "DD"));

        List<String> result = list.stream().filter(s -> !(s.startsWith("B"))).toList();
        System.out.println(result); //[A, C, CA, DD]
    }
}
