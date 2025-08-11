package LEsson17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        //когда пользователю исполнится 100 лет. Использовать Date/Time API.
//        Scanner scanner = new Scanner(System.in);
//        String birthday = scanner.nextLine();
//        LocalDate dateBirth = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//        LocalDate result = dateBirth.plusYears(100);
//        System.out.println(result);
//        scanner.close();

        //Задача 2:
        //Используя Predicate среди массива чисел вывести только те, которые являются
        //положительными
        //       List<Integer> inputNumbers = Arrays.asList(-1, 2, -3, 20, -24);
        //       Predicate<Integer> isPositive = num -> num > 0;
        //       for(int num: inputNumbers){
        //           if(isPositive.test(num)){
        //               System.out.println(num);
        //           }
        //       }

        //Используя Function реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //возвращать сумму, переведенную сразу в доллары.
//        final double ratioOf = 0.33;
//        Function<String, Double> converterUSD = input -> {
//            if (!input.matches("^\\d+(\\.\\d+)?\\sBYN$")) {
//                throw new IllegalArgumentException("Форматы : /100 BYN/ либо /100.5 BYN/");
//            }
//            String[] parts = input.split(" ");
//            double amount = Double.parseDouble(parts[0]);
//            return amount * ratioOf;
//        };
//        System.out.print(converterUSD.apply("200 BY"));

        //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //выводить сумму, переведенную сразу в доллары
//       final double ratioOf = 0.33;
//       Consumer<String> converterUSD = input -> {
//           if (!input.matches("^\\d+(\\.\\d+)?\\sBYN$")) {
//               throw new IllegalArgumentException("Форматы : /100 BYN/ либо /100.5 BYN/");
//           }
//           String[] parts = input.split(" ");
//           double amount = Double.parseDouble(parts[0]);
//           double amount1 = amount * ratioOf;
//           System.out.println(input + " ~ " + amount1 + " USD");
//       };
//      converterUSD.accept("299 BYN");

//Задача 5:
//Используя Supplier написать метод, который будет возвращать введенную с консоли
//строку задом наперед
        Supplier <String> reverseTxt = () -> {
            System.out.println("Введите строку:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            return new StringBuilder(input).reverse().toString();
        };
        String reversed = reverseTxt.get();
        System.out.println(reversed);
    }
}
