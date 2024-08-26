package easyQuestions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EasyQuestions {

    final class User {

        String email;

        public User(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }

    @Test
    public void integerPool() {

        //Intenger Pool (Integer Cache) = +-128

        int first = 1;
        int second = 1;

        // ==
        Assertions.assertSame(first, second);
        // equals
        Assertions.assertEquals(first, second);

        // extended example
        first = 1337;
        second = 1337;

        //!=
        Assertions.assertNotSame(first, second);
        // equals
        Assertions.assertEquals(first, second);
    }

    @Test
    public void stringPool() {

        // String Pool

        String first = "hello";
        String second = "hello";

        // ==
        Assertions.assertSame(first, second);
        // equals
        Assertions.assertEquals(first, second);

        // extended example
        first = new String("world");
        second = new String("world");

        // !=
        Assertions.assertNotSame(first, second);
        // equals
        Assertions.assertEquals(first, second);

        // example with intern
        // Если строка уже есть в пуле, то при вызове метода intern() возвращается ссылка на эту строку из пула.
        // Если строки нет в пуле, то она добавляется туда и возвращается ссылка на неё.

        first = new String("hello").intern();
        second = "hello";

        // ==
        Assertions.assertSame(first, second);
        // equals
        Assertions.assertEquals(first, second);
    }

    @Test
    public void BooleanAndNewBoolean() {

        //конструктор new Boolean deprecated
        // !=
        Assertions.assertNotSame(new Boolean(false), Boolean.FALSE);
        // equals
        Assertions.assertEquals(false, Boolean.FALSE);
        // ==
        Assertions.assertSame(false, Boolean.FALSE);
    }

    @Test
    public void hashMapEqualsHashCode() {

        // regular map
        Map<Long, Long> map = new HashMap<>();
        map.put(1L, 1L);
        Long val = map.get(1L);
        Assertions.assertEquals(1L, val);

        // map with key is mutable object
        Map<Map<Long, Long>, Long> multiMapMap = new HashMap<>();
        multiMapMap.put(map, 2L);

        // build new object to get value => works
        Map<Long, Long> mapKey = new HashMap<>();
        mapKey.put(1L, 1L);
        Long objectValue = multiMapMap.get(mapKey);
        Assertions.assertEquals(2L, objectValue);


        // Чем плохи mutable key. Ниже 3 примера
        // mutate initial map and try to get => not working
        map.put(2L, 1L);
        Long mutable = multiMapMap.get(map);
        System.out.println(mutable);
        Assertions.assertNotEquals(2L, mutable);

        // try again with same object key => not working
        Long tryAgain = multiMapMap.get(mapKey);
        Assertions.assertNotEquals(2L, tryAgain);

        // try again with modified object key => not working
        mapKey.put(2L, 1L);
        Long tryAgainMutated = multiMapMap.get(mapKey);
        Assertions.assertNotEquals(2L, tryAgainMutated);
    }


    //Optional используется для обработки потенциально отсутствующего значения, работы с null
    @Test
    public void OptionallExmaple() {

        User user = new User("edvarganov@gmail.com");
//        User user = new User(null);

        Optional<String> email = Optional.ofNullable(user.getEmail());
        email.ifPresent(System.out::println);


    }



    //Exception

    //Int stream

    //try catch finally

}