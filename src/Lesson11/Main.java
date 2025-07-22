package Lesson11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        //найденные строки и их длину.
        //2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
        //значений их длины.
        //3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        //средней, а также их длину.
        //teachmeskills.by
        //4. Ввести 3 строки с консоли. Найти слово, состояще только из различных символов.е
        //Если таких слов несколько, найти первое из них.
        //5. Вывести на консоль новую строку, которой задублирована каждая буква из
        //начальной строки. Например, "Hello" -> "HHeelllloo"
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите 3 строки:");
        // System.out.println("Введите первую строку:");
        // String str1 = scanner.nextLine();
        // System.out.println("Введите вторую строку:");
        // String str2 = scanner.nextLine();
        // System.out.println("Введите третью строку:");
        // String str3 = scanner.nextLine();
        // String shortLine = str1;
        // String longLine = str2;
        // if (str2.length() < str1.length()) {
        //     shortLine = str2;
        // }
        // if (str3.length() < str1.length()) {
        //     shortLine = str3;
        // }
        // if (str1.length() > str2.length()) {
        //     longLine = str1;
        // }
        // if (str3.length() > str2.length()) {
        //     longLine = str3;
        // }
        // System.out.println("Самая длинная строка " + longLine + " длина " + longLine.length());
        // System.out.println("Самая короткая строка " + shortLine + " длина " + shortLine.length());
        // scanner.close();

        // task2
        //   Scanner scanner = new Scanner(System.in);
        //   System.out.println("Введите 3 строки:");
        //   String[] linesOut = new String[3];
        //   for (int i = 0; i < 3; i++) {
        //       linesOut[i] = scanner.nextLine();
        //   }
        //   //  Через компаратор (нагуглил данный способ, чтобы не перебирать вручную)
        //   Arrays.sort(linesOut, Comparator.comparingInt(String::length));
        //   System.out.println("В порядке возрастания:");
        //   for (String line : linesOut) {
        //       System.out.println(line);
        //   }

        // task3Вывести на консоль те строки, длина которых меньше
//средней, а также их длину.
        //   Scanner scanner = new Scanner(System.in);
        //   System.out.println("Введите 3 строки:");
        //   String[] linesOut = new String[3];
        //   for (int i = 0; i < 3; i++) {
        //       linesOut[i] = scanner.nextLine();
        //   }
        //   double length = 0;
        //   for (String str : linesOut) {
        //       length += str.length();
        //   }
        //   double avgLength = length / 3.0;
        //   System.out.println("Строки, где длина меньше средней:" + avgLength);
        //   for (String str : linesOut) {
        //       if (str.length() < avgLength)
        //           System.out.println("Количество символов: " + str.length() + ", " + str);
        //   }
        //   scanner.close();

        //task4
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите 3 строки:");
        //String [] linesOut = new String[3];
        //for (int i = 0; i < 3; i++) {
        //linesOut[i] = scanner.nextLine();
        //}
        //????

        //task5
        //  Scanner scanner = new Scanner(System.in);
        //  System.out.println("Введите строку:");
        //  String word = scanner.nextLine();
        //  StringBuilder strBr = new StringBuilder();
        //  for (int i = 0; i < word.length(); i++) {
        //      char symb = word.charAt(i);
        //      strBr.append(symb).append(symb);
        //  }
        //  System.out.println(strBr.toString());
        //  scanner.close();
    }
}

