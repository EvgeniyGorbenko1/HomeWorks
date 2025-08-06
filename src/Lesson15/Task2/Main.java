package Lesson15.Task2;

public class Main {
    public static void main(String[] args) {
        //Создать класс, который будет хранить в себе коллекцию с названиями животных.
        //Реализовать методы удаления и добавления животных по следующим правилам:
        //добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
        //объекта этого класса в main методе другого класса
       Collection zoo = new Collection();
       zoo.add("Wolf");
       zoo.add("Rabbit");
       zoo.add("Snake");
       zoo.info();
       zoo.remove();
       zoo.info();


}
}