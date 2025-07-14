package Lesson8;

public class Main {
    public static void main(String[] args) {
    Tiger tiger = new Tiger();
    Rabbit rabbit = new Rabbit();
    Dog dog = new Dog();

    tiger.voice();
    tiger.eat("Meat");

    rabbit.voice();
    rabbit.eat("Meat");

    dog.voice();
    dog.eat("Meat");


    }
}
//Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
//Переопределить методы voice(), eat(String food) чтобы они выводили верную
//информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
