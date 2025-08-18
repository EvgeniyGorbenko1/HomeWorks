package Lesson18;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        //Задача 1:
        //Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        //Stream'ов:
        //- Удалить дубликаты
        //- Оставить только четные элементы
        //- Вывести сумму оставшихся элементов в стриме
        List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 5, 6);
        int result = numbers.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .reduce(Integer::sum).orElseThrow();
        System.out.println(result);
    }
}
