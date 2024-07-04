package stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stream {
    public static void main(String[] args) {

        Stream stream = new Stream();
        stream.useMap();
    }

    String lineSeparator = "===========================================================================================";

    @Test
    public void useFilter() {

//        Используйте filter для фильтрации элементов:

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers); // [2, 4, 6, 8]
        assertEquals(Arrays.asList(2, 4, 6, 8), evenNumbers);
    }

    @Test
    public void useMap() {

//        С помощью метода map вы можете преобразовать каждый элемент стрима.

        List<String> list = Arrays.asList("c", "d", "f", "y");
        List<String> upperCased = list.stream()
                .map(String::toUpperCase) //.map(s -> s.toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCased); // [C, D, F, Y]
        System.out.println(lineSeparator);
        assertEquals(Arrays.asList("C", "D", "F", "Y"), upperCased);


        List<String> listString = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLength = listString.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(nameLength); // [5, 3, 7]
        System.out.println(lineSeparator);
        assertEquals(Arrays.asList(5, 3, 7), nameLength);
    }

    @Test
    public void useFlatMap() {

//        Метод flatMap: преобразует каждый элемент в Stream, объединяет Stream всех элементов в один и передает его следующему оператору.
//        То есть, если у нас есть список, в котором находятся другие списки, может их вытащить в один стрим

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(list10 -> list10.stream())
                .collect(Collectors.toList());
        System.out.println(flattenedList); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(lineSeparator);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), flattenedList);



        List<Integer> flattenedList2 = listOfLists.stream()
                .flatMap(l -> l.stream())
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println(flattenedList2); // [2, 4, 6, 8, 10, 12, 14, 16, 18]
        System.out.println(lineSeparator);
        assertEquals(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18), flattenedList2);


        List<List<String>> listOfLists2 = Arrays.asList(
                Arrays.asList("t", "y", "9"),
                Arrays.asList("z", "2", "b"),
                Arrays.asList("a", "9", "e")
        );
        List<String> flattenedList3 = listOfLists2.stream()
                .flatMap(l -> l.stream())
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(flattenedList3); // [T, Y, 9, Z, 2, B, A, 9, E]
        System.out.println(lineSeparator);
        assertEquals(Arrays.asList("T", "Y", "9", "Z", "2", "B", "A", "9", "E"), flattenedList3);
    }

    @Test
    public void usePeek() {

        //peek не изменяет элементы и используется для побочных действий без изменения данных, например для дебага

        //В этом примере peek используется для вывода информации в лог на этапе фильтрации и на этапе отображения элементов,
        //но оно не изменяет сами элементы или результат операции.

        //Основная цель метода peek - это отладка и промежуточный анализ данных в потоке без изменения самих элементов.

                List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> result = names.stream()
                .filter(name -> name.length() > 4)
                .peek(name -> System.out.println("Filtering: " + name))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("Mapping: " + name))
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println(lineSeparator);

        //Вывод в консоль:
        //Filtering: Alice
        //Mapping: ALICE
        //Filtering: Charlie
        //Mapping: CHARLIE
        //Filtering: David
        //Mapping: DAVID
        //[ALICE, CHARLIE, DAVID]
    }

    @Test
    public void useSorted() {

//        Метод sorted позволяет сортировать элементы:

        List<String> list2 = Arrays.asList("c", "a", "b", "d");
        List<String> sortedList = list2.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedList); // [a, b, c, d]
        assertEquals(Arrays.asList("a", "b", "c", "d"), sortedList);

    }

    @Test
    public void useCount() {

//        Для подсчета элементов используется метод count:

        List<String> list3 = Arrays.asList("a", "b", "c", "d");
        long count = list3.stream().count();
        System.out.println(count);  // 4
        assertEquals(4, count);
    }

    @Test
    public void useMinMax() {

//        Получение максимума/минимума

        List<Integer> list4 = Arrays.asList(1, 3, 2, 8, 5, 6, 4);
        Optional<Integer> max = list4.stream().max(Integer::compareTo);
        Optional<Integer> min = list4.stream().min(Integer::compareTo);
        System.out.println(min.get()); // 1
        System.out.println(max.get()); // 8

        assertEquals(Integer.valueOf(1), min.get());
        assertEquals(Integer.valueOf(8), max.get());
    }

    @Test
    public void useJoin() {

//        Собирание результатов

        List<String> list = Arrays.asList("a", "b", "c", "d");
        String concatenated = list.stream().collect(Collectors.joining(", "));
        System.out.println(list);  // [a, b, c, d]
        System.out.println(concatenated);  // a, b, c, d
    }

    @Test
    public void useFilterIntStream() {
        // Массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Использование IntStream для фильтрации четных чисел
        List<Integer> evenNumbers = IntStream.of(numbers)
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toList());

        // Вывод результата
        System.out.println(evenNumbers); // [2, 4, 6, 8]

        // Проверка результата
        assertEquals(Arrays.asList(2, 4, 6, 8), evenNumbers);
    }
}
