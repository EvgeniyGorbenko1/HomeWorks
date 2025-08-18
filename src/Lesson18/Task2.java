package Lesson18;

import java.util.HashMap;
import java.util.List;
import java.util.Set;


public class Task2 {
    public static void main(String[] args) {
        //Задача *:
        //Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
        //этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
        //Среди отобранных значений отобрать только те, которые имеют нечетное количество
        //букв в имени. После чего вернуть список List имен, записанных буквами задом наперед
        HashMap<Integer, String> idName = new HashMap<>();
        idName.put(1, "Masha");
        idName.put(2, "Alex");
        idName.put(3, "Maga");
        idName.put(4, "Anton");
        idName.put(5, "Kolya");
        idName.put(7, "Max");
        idName.put(8, "Mark");
        idName.put(9, "Fedor");
        idName.put(13, "Misha");

        Set<Integer> allowed = Set.of(1, 2, 5, 8, 9, 13);
        List<String> result = idName.entrySet().stream()
                .filter(entry -> allowed.contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 ==1)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .toList();
        System.out.println(result);
    }
}
