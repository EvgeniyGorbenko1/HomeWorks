package Lesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
        public static void main(String[] args) {
  //         Scanner scanner = new Scanner(System.in);
  //         String sentence = scanner.nextLine();
  //         String regex = "[A-ZА-Я]{2,6}";

  //         Pattern pattern = Pattern.compile(regex);
  //         Matcher matcher = pattern.matcher(sentence);

  //         while (matcher.find()) {
  //             System.out.println(matcher.group());
  //         }
  //         scanner.close();


            /*Программа на вход получает произвольный текст. В этом тексте может быть номер
документа(один или несколько), емейл и номер телефона. Номер документа в формате:
xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
может содержать не всю информацию, т.е. например, может не содержать номер
телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
формате:
email: teachmeskills@gmail.com
document number: 1423-1512-51
и т.д */
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();
            String doc = scanner.nextLine();
            String phoneNum = scanner.nextLine();
            String regexEmail = "[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}";
            String regexDoc = "(\\d{4}-){2}\\d{2}";
            String regexPhone = "\\+\\(\\d{2}\\)\\d{7}";

            Pattern pattern1 = Pattern.compile(regexEmail);
            Pattern pattern2 = Pattern.compile(regexDoc);
            Pattern pattern3 = Pattern.compile(regexPhone);                       //TODO: Не понял почему не работает вывод эмейла
            Matcher matcher1 = pattern1.matcher(email);
            Matcher matcher2 = pattern2.matcher(doc);
            Matcher matcher3 = pattern3.matcher(phoneNum);

            while (matcher1.find()) {
                System.out.println("email:" + matcher1.group());
            }

            while (matcher2.find()) {
                System.out.println("Document number:" + matcher2.group());
            }

            while (matcher3.find()) {
                System.out.println("phonenumber:" + matcher3.group());
            }
            scanner.close();
        }
    }
