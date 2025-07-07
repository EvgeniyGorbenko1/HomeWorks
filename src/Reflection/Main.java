package Reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Apple apple = new Apple();
        Field field = Apple.class.getDeclaredField("color");
        field.setAccessible(true);
        String value = (String) field.get(apple);
        System.out.println(value);
       // field.set(value, "red");
       // System.out.println(value); //не понял как задать своё значение
    }

}
