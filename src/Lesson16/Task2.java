package Lesson16;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        //На вход поступает массив непустых строк, создайте и верните Map<String,
        //String> следующим образом: для каждой строки добавьте ее первый символ в
        //качестве ключа с последним символом в качестве значения. Пример:
        //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        //pairs(["man", "moon", "main"]) → {"m": "n"}
        //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        String[] pairs = {"code", "bug"};
        Map <String,String> map = new HashMap<>();
        for (String str : pairs) {
            String first = String.valueOf(str.charAt(0));
            String last = String.valueOf(str.charAt(str.length() - 1));
            map.put(first, last);
        }
        System.out.println(map);
    }
}
