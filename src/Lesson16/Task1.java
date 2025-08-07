package Lesson16;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        //На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
        //строка является ключом, и ее значение равно true, если эта строка встречается в массиве
        //2 или более раз. Пример:
        //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        String[] wordMultiple = {"a", "b", "a", "c", "b"};
        Map<String, Boolean> map = new HashMap<>();
        for (String word : wordMultiple) {
            if (map.containsKey(word)) {
                map.replace(word, true);
            } else {
                map.put(word, false);
            }
        }
        System.out.println(map);

    }
}
