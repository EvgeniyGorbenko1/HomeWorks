package Lesson10;

public class Main {
    //Задача 1:
    //Создать класс для описания пользователя системы. Переопределить в классе методы
    //toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
    //значением полей и сравнить с помощью метода equals
    public static void main(String[] args) {
        UserSyst user1 = new UserSyst(1, "Max", "Maximov" );
        UserSyst user2 = new UserSyst(2, "Masha", "Maximova" );
        UserSyst user3 = new UserSyst(1, "Max", "Maximov" );
        System.out.println(user1.equals(user2));
        System.out.println(user1.toString());
        System.out.println(user1.hashCode());
        System.out.println(user2.toString());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user3));
    }
}
