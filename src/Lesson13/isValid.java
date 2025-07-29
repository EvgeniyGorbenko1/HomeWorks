package Lesson13;

public class isValid {

    public static void valid(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        validLogin(login);
        validPassword(password, confirmPassword);
    }
    public static void validLogin(String login) throws WrongLoginException {
        if (login == null || login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Длина login должна быть меньше 20 символов и не должен содержать пробелы.");
        }
    }
    public static void validPassword(String password, String confirmPassword) throws WrongPasswordException {
        if(password == null || password.length() >=20 || password.contains(" ")  || !password.equals(confirmPassword) || !password.matches(".*\\d+")){
            throw new WrongPasswordException("Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.");
        }
    }

}
