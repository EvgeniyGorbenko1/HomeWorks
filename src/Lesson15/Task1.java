package Lesson15;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        //Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        //4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        //При решении использовать коллекции
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа через запятую: ");
        String input = scanner.nextLine();
        String[] numbers = input.replaceAll("\\s+", "").split(",");
        Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));
        System.out.println(uniqueNumbers);
        scanner.close();
    }
}
