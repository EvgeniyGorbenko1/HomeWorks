package Lesson13;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        //Создать класс, в котором будет статический метод. Этот метод принимает на вход три
        //параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
        //login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
        //соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
        //password должна быть меньше 20 символов, не должен содержать пробелом и должен
        //teachmeskills.by
        //содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
        //Если password не соответствует этим требованиям, необходимо выбросить
        //WrongPasswordException. WrongPasswordException и WrongLoginException -
        //пользовательские классы исключения с двумя конструкторами – один по умолчанию,
        //второй принимает сообщение исключения и передает его в конструктор класса Exception.
        //Метод возвращает true, если значения верны, false в противном случае

        isValid.validLogin("Aboba");
        isValid.validPassword("aboba12", "aboba12");
    }

}
